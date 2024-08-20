package L13C1;

class term {
    int coeef;
    int pow;
    char var;
    term link;

    // Constructor for term
    term(int coeef, int pow, char var) {
        this.coeef = coeef;
        this.pow = pow;
        this.var = var;
        this.link = null;
    }
}

class expression {
    public term first = null;

    // Method to add a new term to the polynomial expression
    public void addTerm(int coeef, int pow, char var) {
        term newTerm = new term(coeef, pow, var);
        if (first == null) {
            first = newTerm;
        } else {
            term temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newTerm;
        }
    }

    // Method to display the polynomial expression
    public void displayExpression() {
        term temp = first;
        while (temp != null) {
            System.out.print(temp.coeef + "" + temp.var + "^" + temp.pow);
            temp = temp.link;
            if (temp != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    // Method to add two polynomial expressions
    public expression add(expression expr) {
        expression result = new expression();
        term p1 = this.first;
        term p2 = expr.first;

        while (p1 != null && p2 != null) {
            if (p1.pow == p2.pow) {
                result.addTerm(p1.coeef + p2.coeef, p1.pow, p1.var);
                p1 = p1.link;
                p2 = p2.link;
            } else if (p1.pow > p2.pow) {
                result.addTerm(p1.coeef, p1.pow, p1.var);
                p1 = p1.link;
            } else {
                result.addTerm(p2.coeef, p2.pow, p2.var);
                p2 = p2.link;
            }
        }

        // Add remaining terms from the first polynomial
        while (p1 != null) {
            result.addTerm(p1.coeef, p1.pow, p1.var);
            p1 = p1.link;
        }

        // Add remaining terms from the second polynomial
        while (p2 != null) {
            result.addTerm(p2.coeef, p2.pow, p2.var);
            p2 = p2.link;
        }

        return result;
    }
}

public class L13C1 {
    public static void main(String[] args) {
        expression expr1 = new expression();
        expr1.addTerm(5, 2, 'x');
        expr1.addTerm(4, 1, 'x');
        expr1.addTerm(2, 0, 'x');

        expression expr2 = new expression();
        expr2.addTerm(5, 1, 'x');
        expr2.addTerm(5, 0, 'x');

        System.out.print("Expression 1: ");
        expr1.displayExpression();

        System.out.print("Expression 2: ");
        expr2.displayExpression();

        expression result = expr1.add(expr2);

        System.out.print("Resultant Expression: ");
        result.displayExpression();
    }
}
