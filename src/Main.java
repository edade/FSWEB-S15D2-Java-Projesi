import model.Task;
import model.TaskData;
import model.enums.Priority;
import model.enums.Status;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//       Task bob1=   new Task("backend1", "about sets", "bob",Priority.MED, Status.ASSIGNED);
//        Task bob2=   new Task("backend2", "about sets2", "bob",Priority.LOW, Status.IN_PROGRESS);
//
//
//        Task ann1=   new Task("frontend", "about react", "ann",Priority.LOW, Status.ASSIGNED);
//        Task ann2=   new Task("fronted2", "about react2", "ann",Priority.LOW, Status.IN_PROGRESS);
//
//        Task carol=   new Task("full-stack", "about website", "carol",Priority.LOW, Status.IN_QUEUE);
//        Task carol2=   new Task("full-stack2", "about website2", "carol",Priority.LOW, Status.ASSIGNED);
//
//        Task unassigned = new Task("project1","description",null,Priority.HIGH,Status.IN_PROGRESS);
//     Task unassigned2 = new Task("project2","description2",null,Priority.HIGH,Status.IN_PROGRESS);
//
//        Set<Task> annTasks = new LinkedHashSet<>();
//        annTasks.add(ann1);
//        annTasks.add(ann2);
//
//        Set<Task> bobsTasks = new LinkedHashSet<>();
//        bobsTasks.add(bob1);
//        bobsTasks.add(bob2);
//
//        Set<Task> carolTasks = new LinkedHashSet<>();
//        carolTasks.add(carol);
//        carolTasks.add(carol2);
//        carolTasks.add(ann1);
//
//     Set<Task> unassingedTasks = new LinkedHashSet<>();
//     unassingedTasks.add(unassigned);
//     unassingedTasks.add(unassigned2);
//
//
//        Set<Task> allTasks = new LinkedHashSet<>();
//        allTasks.addAll(annTasks);
//        allTasks.addAll(bobsTasks);
//        allTasks.addAll(carolTasks);
//        allTasks.addAll(unassingedTasks);
//
//
//
//
//        TaskData taskData = new TaskData(annTasks,bobsTasks,carolTasks);
//     System.out.println("all tasks");
//        System.out.println(taskData.getTasks("all"));
//     System.out.println("anns tasks");
//     System.out.println(taskData.getTasks("ann"));
//     System.out.println("bobs tasks");
//     System.out.println(taskData.getTasks("bob"));
//     System.out.println("carols tasks");
//     System.out.println(taskData.getTasks("carol"));
//
//     Set<Task> unassignedTasks = getDifference(allTasks, taskData.getTasks("all"));
//     System.out.println("Herhangi bir çalışana atanmamış olan tasklar:");
//     printTasks(unassignedTasks);
//
//
//
//     Set<Task> intersectTasks = getIntersection(annTasks, carolTasks);
//     System.out.println("Birden fazla çalışana atanmış tasklar:");
//     printTasks(intersectTasks);
//    }
//
//
// public static void printTasks(Set<Task> tasks) {
//  for (Task task : tasks) {
//   System.out.println(task);
//  }
// }
//
//
// public static Set<Task> getUnion(Set<Task>... sets) {
//  Set<Task> union = new HashSet<>();
//  for (Set<Task> set : sets) {
//   union.addAll(set);
//  }
//  return union;
// }
//
//
// public static Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
//  Set<Task> intersection = new HashSet<>(set1);
//  intersection.retainAll(set2);
//  return intersection;
// }
//
//
// public static Set<Task> getDifference(Set<Task> set1, Set<Task> set2) {
//  Set<Task> difference = new HashSet<>(set1);
//  difference.removeAll(set2);
//  return difference;
// }
     String text = "Carroll began writing the manuscript of the story the next day, although that earliest version is lost." + "The girls and Carroll took another boat trip a month later, when he elaborated the plot to the story of Alice," + " and in November he began working on the manuscript in earnest. To add the finishing touches he researched" + " natural history in connection with the animals presented in the book and then had the book examined" + " by other children—particularly those of George MacDonald. Though Carroll did add his own illustrations" + " to the original copy, on publication he was advised to find a professional illustrator so the pictures" + " were more appealing to its audiences. He subsequently approached John Tenniel to reinterpret" + " Carroll's visions through his own artistic eye, telling him that the story had been well liked by the " + "children.\n" + "\n" + " Carroll began planning a print edition of the Alice story in 1863." + " He wrote on 9 May 1863 that MacDonald's family had suggested he publish Alice. " + "A diary entry for 2 July says that he received a specimen page of the print edition around that date." + " On 26 November 1864, Carroll gave Alice the manuscript of Alice's Adventures Under Ground, with illustrations" + " by Carroll, dedicating it as A Christmas Gift to a Dear Child in Memory of a Summer's Day. " + "The published version of Alice's Adventures in Wonderland is about twice the length of" + " Alice's Adventures Under Ground and includes episodes, such as the Mad Tea-Party," + " that did not appear in the manuscript. The only known manuscript copy of Under Ground" + " is held in the British Library. Macmillan published a facsimile of the manuscript in 1886.";

     text = text.replaceAll("[.,!?]", "");

     String[] words = text.split("\\s+");

     Set<String> uniqueWords = new TreeSet<>(Arrays.asList(words));


     System.out.println(uniqueWords);
    }
}