package prat;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.*;

public class p {
//static class MySort implements Comparator<String>{
//	public int compare(String s, String b) {
//		return b.compareTo(s);
//	}
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum= Arrays.stream(arr).filter(i->i%2==0).sum();
		System.out.println(sum);
		
		int x= IntStream.rangeClosed(1,10).filter(i->i%2==0).sum();
		System.out.println(x);
		
//		Supplier <String> c= String::new;
//		c.accept("Hello");
//		String[] t= {"aspen","vail","t-ride","dillion"};
//		MySort ms= new MySort();
//		Arrays.sort(t,ms);
//		System.out.println(Arrays.binarySearch(t, "dillion"));
//		Set set= new TreeSet();
//		set.add("2");
//		set.add(3);
//		set.add("1");
//		Iterator it= set.iterator();
//		while (it.hasNext())
//			System.out.println(it.next()+" ");
//		try {
//			System.out.println("l");
//			int v= 5/0;
//			System.out.println("val"+v);
//		}
//		catch(ArithmeticException ex){
//			System.out.println("2");
//			System.exit(0);
//		}
//		finally {
//			System.out.println("3");
//		}
//		System.out.println("4");
////		List<Student> students= new ArrayList<Student>();
////		students.add(new Student("a", "b", 3));
////		students.add(new Student("c", "d", 4));
	}
	

}











package com.cap.pwt;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestWorkoutRepository {

	WorkoutRepository workoutRepository;
	
	@Before
	public void setUp() {
		workoutRepository = new WorkoutRepository();
	}
	@Test
	public void assignWorkoutToUser() {
		String workoutTitle = "Triceps workout";
		String email = "test@test.com";
		
		
		
		workoutRepository.assignWorkoutToUser(email, workoutTitle);
		
		
	}
//	@Test
//	public void testDeleteWorkout() {
//		workoutRepository.deleteWorkout(1);
//	}
//	@Test
//	public void testDeleteCategory() {
//		workoutRepository.deleteCategory(11);
//	}
//	@Test
//	public void testFindWorkoutsByCategoryName() {
//		List<Workout> workouts = workoutRepository.findallWorkoutInCategoryByName("Core");
//		System.out.println(workouts);
//	}
//	@Test
//	public void testupdateWorkoutcbpm() {
//		workoutRepository.updateWorkoutcbpm(1, 654);
//	}
//	@Test
//	public void testupdateWorkouttTitle() {
//		workoutRepository.updateWorkouttTitle(1, "New title");
//	}
//	@Test
//	public void testfindallWorkoutInCategoryByName() {
//		List<Workout> l=workoutRepository.findallWorkoutInCategoryByName("Core");
//		System.out.println(l);
//	}
//	@Test
//	public void testfindAllCategory() {
//		List<Category> l=workoutRepository.findAllCategory();
//		System.out.println(l);
//	}
//	
//	@Test
//	public void testfindCategory() {
//		Category l=workoutRepository.findCategory(2);
//		System.out.println(l);
//	}
//	@Test
//	public void testeditCategory() {
//		workoutRepository.editCategory(2,"CORE");
//	}
//	@Test
//	public void testaddCategory() {
//		workoutRepository.addCategory(new Category("new category"));
//	}
	
	

//	@Test
//	public void testAddWorkout() {
//		Category category = new Category("Core");
//		Workout workout = new Workout("dead bug  Workout", category, 70, "strong");
//		
//		workoutRepository.addWorkout(workout);
////		Category s=workoutRepository.findCategoryByName("Core");
////		System.out.println(s);
////		List<Workout> l=workoutRepository.findallWorkoutInCategoryByName("Core");
////		System.out.println(l);
//	}
//	@Test
//	public void testStartActiveWorkout() {
//		int id = 5;
//		workoutRepository.testStartActiveWorkout(id);
//	}
	@Test
	public void addUser() {
		User user  = new User("test@test.com", "test");
		UserRepository repository = new  UserRepository();
		repository.addUser(user);
	}
	
	
}
