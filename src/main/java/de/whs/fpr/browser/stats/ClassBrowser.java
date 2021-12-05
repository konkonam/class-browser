package de.whs.fpr.browser.stats;

import de.whs.fpr.browser.stats.data.ClassData;

/**
 * Class browser.
 *
 * A browser that takes a class name as an input and displays the classes' data.
 *
 * @author Frederik Bußmann
 */
public class ClassBrowser {
    /**
     * The data of the current class.
     */
    private ClassData classData;

    /**
     * Searches for a class by a given name.
     *
     * @param className The class name to search for.
     */
    public void search(String className) {
        classData = null;

        try {
            Class<?> foundClass = Class.forName(className);

            this.classData = new ClassData(foundClass);
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Gets the found classes' data as a string.
     *
     * @return The data of the class as a string.
     */
    public String classDataToString() {
        if (classData != null) {
            return classData.toString();
        }
        else {
            return "Class could not be found!";
        }
    }

    /**
     * Prints the found class to the console.
     */
    public void printClass() {
        System.out.println(classDataToString());
    }
}
