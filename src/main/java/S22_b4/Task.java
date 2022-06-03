package S22_b4;

public class Task {
    private String description;
    private int priority;


    public Task(String description) {
        /*
        Da die Standardwerte so gewählt sind, dass sie den Datenstrukturinvarianten
        entsprechen, besteht keine Notwendigkeit, die set-Methoden zu verwenden.
        Es ist aber auch nicht falsch, trotzdem die Methoden zu verwenden.
         */

        /* METHODE VOR DER ÄNDERUNG
        if (!setDescription(description)) {
            System.err.println("Fehler: description darf nicht leer sein!");
            this.description = "Aufgabe";
        }
        this.priority = 1;
        */

        try {
            setDescription(description);
        } catch (IllegalArgumentException e) {
            this.description = "Aufgabe";
            System.out.println(e.getMessage());
        }
    }

    public Task(String description, int priority) {
        /*
        Da die Standardwerte so gewählt sind, dass sie den Datenstrukturinvarianten
        entsprechen, besteht keine Notwendigkeit, die set-Methoden zu verwenden.
        Es ist aber auch nicht falsch, trotzdem die Methoden zu verwenden.
         */

        try {
            setDescription(description);
        } catch (IllegalArgumentException e) {
            this.description = "Aufgabe";
            System.out.println(e.getMessage());
        }

        try {
            setPriority(priority);
        } catch (IllegalArgumentException e) {
            this.priority = 1;
            System.out.println(e.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    private static boolean checkDescription(String description) {
        return !description.equals("");
    }

    private static boolean checkPriority(int priority) {
        return (priority < 6 && priority > 0);
    }


    public void setDescription(String description) {
        if (checkDescription(description)) {
            this.description = description;
        } else {
            throw new IllegalArgumentException("Fehler:  description darf nicht leer sein!");
        }
    }

    public void setPriority(int priority) throws IllegalArgumentException {
        if (checkPriority(priority)) {
            this.priority = priority;
        } else {
            throw new IllegalArgumentException("Fehler: priority muss zwischen einschließlich 1 und 5 sein!Fehler: priority muss zwischen einschließlich 1 und 5 sein!");
        }
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        }
        if (anObject.getClass().equals(Task.class)) {
            Task t = (Task) anObject;
            if (this.getDescription().contentEquals(t.getDescription())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static Task prioritize(Task task1, Task task2) {
        if (task1.getPriority() < task2.getPriority()) {
            return task1;
        } else if (task2.getPriority() < task1.getPriority()) {
            return task2;
        } else {
            if (Math.random() < 0.5) {
                return task1;
            } else {
                return task2;
            }
        }
    }

    @Override
    public String toString() {
        return description + " (" + priority + ")";
    }

}
