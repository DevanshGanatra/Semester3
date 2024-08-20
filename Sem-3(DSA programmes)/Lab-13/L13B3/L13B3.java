package L13B3;

class Song {
    String title;
    Song prev;
    Song next;

    Song(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}

class PlayList {
    private Song firstSongOfPlaylist = null;
    private Song LastSongOfPlaylist = null;

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (firstSongOfPlaylist == null) {
            firstSongOfPlaylist = LastSongOfPlaylist = newSong;
            firstSongOfPlaylist.next = firstSongOfPlaylist;
            firstSongOfPlaylist.prev = firstSongOfPlaylist;
        } else {
            LastSongOfPlaylist.next = newSong;
            newSong.prev = LastSongOfPlaylist;
            newSong.next = firstSongOfPlaylist;
            firstSongOfPlaylist.prev = newSong;
            LastSongOfPlaylist = newSong;
        }
    }

    public void deleteSong(String title) {
        if (firstSongOfPlaylist.title == title) {// checks for first song
            if (firstSongOfPlaylist == LastSongOfPlaylist) {// checks if only one song
                firstSongOfPlaylist = LastSongOfPlaylist = null;
            } else {
                firstSongOfPlaylist = firstSongOfPlaylist.next;
                firstSongOfPlaylist.prev = LastSongOfPlaylist;
                LastSongOfPlaylist.next = firstSongOfPlaylist;
            }
            return;
        } else if (LastSongOfPlaylist.title == title) {// chhecks for last song
            LastSongOfPlaylist = LastSongOfPlaylist.prev;
            LastSongOfPlaylist.next = firstSongOfPlaylist;
            firstSongOfPlaylist.prev = LastSongOfPlaylist;
            return;
        }
        Song temp = firstSongOfPlaylist;
        while (temp.next != firstSongOfPlaylist) {
            if (temp.title.equals(title)) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    public void display() {
        if (firstSongOfPlaylist == null)
            return;
        Song temp = firstSongOfPlaylist;
        while (temp.next != firstSongOfPlaylist) {
            System.out.println(temp.title + " ");
            temp = temp.next;
        }
        System.out.print(temp.title + " ");
        System.out.println();
    }

    public int getPlayListSize() {
        if (firstSongOfPlaylist == null)
            return 0;
        else if (firstSongOfPlaylist == LastSongOfPlaylist)
            return 1;
        else {
            Song temp = firstSongOfPlaylist;
            int count = 0;
            do {
                count++;
                temp = temp.next;
            } while (temp != firstSongOfPlaylist);
            return count;
        }
    }

    public void shufflePlayList() {
        int n = getPlayListSize();
        if (n <= 1)
            return;
        Song[] songArr = new Song[n];
        Song temp = firstSongOfPlaylist;
        for (int i = 0; i < n; i++) {
            songArr[i] = temp;
            temp = temp.next;
        }
        for (int i = n - 1; i > 0; i--) {
            int k = (int) (Math.random() * (i + 1));
            Song songTemp = songArr[k];
            songArr[k] = songArr[i];
            songArr[i] = songTemp;
        }

        firstSongOfPlaylist = songArr[0];
        LastSongOfPlaylist = songArr[n - 1];
        LastSongOfPlaylist.next = firstSongOfPlaylist;
        firstSongOfPlaylist.prev = LastSongOfPlaylist;
        for (int i = 0; i < n; i++) {
            songArr[i].next = songArr[(i + 1) % n];
            // "i + 1": The index of the next song.
            // "% size": The modulus operator ensures that if i is the last index (size - 1),
            // (i + 1) wraps around to 0, making the list circular.
            songArr[i].prev = songArr[(i - 1 + n) % n];
            // "i - 1": The index of the previous song.
            // "+ n": Adding size ensures that the index is non-negative before taking the
            // modulus.
        }
    }
}
public class L13B3 {
    public static void main(String[] args) {
        PlayList playList = new PlayList();

        // Add some songs
        playList.addSong("Song 1");
        playList.addSong("Song 2");
        playList.addSong("Song 3");
        playList.addSong("Song 4");
        
        // Display playlist
        System.out.println("Playlist before shuffle:");
        playList.display();
        
        // Shuffle playlist
        playList.shufflePlayList();
        
        // Display playlist after shuffle
        System.out.println("Playlist after shuffle:");
        playList.display();
        
        // Delete a song
        playList.deleteSong("Song 2");
        
        // Display playlist after deletion
        System.out.println("Playlist after deleting 'Song 2':");
        playList.display();
    }
}