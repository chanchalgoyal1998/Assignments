package com.yash.ServiceImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yash.models.Student;
import com.yash.models.StudentTestAttempt;
import com.yash.models.Teacher;
import com.yash.models.Test;
import com.yash.models.TestQuestions;
import com.yash.repo.StudentRepo;
import com.yash.repo.StudentTestAttemptRepo;
import com.yash.repo.TeacherRepo;
import com.yash.repo.TestQuestionRepo;
import com.yash.repo.TestRepo;
@Component
public class OperationServiceImpl {
     @Autowired
	private StudentRepo repo;
     @Autowired
 	private TeacherRepo trepo;
     
     @Autowired
  	private TestRepo testrepo;
     @Autowired
     private TestQuestionRepo tques;

     @Autowired
     private StudentTestAttemptRepo sattrepo;
	public void addStudent(Student s)
	{
		repo.save(s);
	}
	public void addTeacher(Teacher s) {
		trepo.save(s);
		
	}
	public void addTest(Test s) {
		 testrepo.save(s);
		
	}
	public void addStudentTestAttempt(StudentTestAttempt s) {
		sattrepo.save(s);
		
	}
	public void addQues(TestQuestions s) {
		tques.save(s);
		
	}
	public List<StudentTestAttempt> getAllAttempt() {
	List<StudentTestAttempt>list=sattrepo.findAll();
//	for(StudentTestAttempt s:list)
//	System.out.println(s);
	return list;
		
	}
	
	public Map<Student, Integer> studentWithMarks()
	{
		List<StudentTestAttempt>list=getAllAttempt();
		Map<Student,Integer> hm= new HashMap<>();
		 System.out.println("i ");
			
			list.stream().map(t->{
				//Integer count=hm.get(t.getStudent());
				//System.out.println(count);
				//System.out.println("hello "+hm.get(t.getStudent()));
				/*if(hm.get(t.getStudent()) != null) { System.out.println("i am present");
				  hm.put(t.getStudent(),(hm.get(t)+1)); }else { hm.put(t.getStudent(),1); }
				*/
				
				Integer count=hm.get(t.getStudent());
				if(count==null)
				{
					 hm.put(t.getStudent(),1);
					 
				}	
				else
				{
					String answer="";
					System.out.println("i am present");
					if(t.getMarkedAnswer()==1)
					{	
						answer=t.getQuestion().getAnswer1();
					}	
					else if(t.getMarkedAnswer()==2)
					{
						answer=t.getQuestion().getAnswer2();
					}	
					else if(t.getMarkedAnswer()==3)
					{
						answer=t.getQuestion().getAnswer3();
					}
					else if(t.getMarkedAnswer()==4)
					{
						answer=t.getQuestion().getAnswer4();
					}
						
				     if(answer.equalsIgnoreCase(t.getQuestion().getCorrectanswer()))
					    hm.put(t.getStudent(),count+1);
				}	
				return 0;
				
			}
			).forEach(t->System.out.println());
			return hm;
		 
	}
	
	public Optional<Entry<Student, Integer>> studentWithHighestMarks() {
		
		//map.put(list.get(0).getStudent(), 0);
		/*for(StudentTestAttempt sa:list)
		{
			System.out.println(sa);
			if(map.containsKey(sa))
			{
				System.out.println("i am present");
				map.put(sa.getStudent(),(map.get(sa)+1));
			}	
			else
			{
				map.put(sa.getStudent(),1);
			}	
		}*/
		/*for(StudentTestAttempt sa:list) {
		map.entrySet().stream().filter(t->t.getKey().equals(sa)).forEach(t->System.out.println("hello"));
		
		}*/
		
		//System.out.println(map);
		
	
			//Integer count=hm.get(t.getStudent());
			//System.out.println(count);
			//System.out.println("hello "+hm.get(t.getStudent()));
			/*if(hm.get(t.getStudent()) != null) { System.out.println("i am present");
			  hm.put(t.getStudent(),(hm.get(t)+1)); }else { hm.put(t.getStudent(),1); }
			*/
			
		Map<Student, Integer>hm= studentWithMarks();
		Optional<Entry<Student, Integer>> hm1=hm.entrySet().stream().max((Entry<Student,Integer>t1,Entry<Student,Integer>t2)->t1.getValue()-t2.getValue());
	   return hm1;     
	}
	
	public Optional<Entry<Student, Integer>> studentWithLowestMarks() {
		Map<Student, Integer>hm= studentWithMarks();
		Optional<Entry<Student, Integer>> hm1=hm.entrySet().stream().min((Entry<Student,Integer>t1,Entry<Student,Integer>t2)->t1.getValue()-t2.getValue());
	   return hm1;
	}
	
	public double avgOfWrongQuestion() {
	
		return 0;
	}
	
	
	
/*	public void totalMarksToeachStudent() {
	
		List<StudentTestAttempt>list=getAllAttempt();
		Map<Student,Integer> hm= new HashMap<>();
		 System.out.println("i ");
			
			list.stream().map(t->{
				Integer count=hm.get(t.getStudent());
				if(count==null)
				{
					 hm.put(t.getStudent(),1);
					 
				}	
				else
				{
					String answer="";
					System.out.println("i am present");
					if(t.getMarkedAnswer()==1)
					{	
						answer=t.getQuestion().getAnswer1();
					}	
					else if(t.getMarkedAnswer()==2)
					{
						answer=t.getQuestion().getAnswer2();
					}	
					else if(t.getMarkedAnswer()==3)
					{
						answer=t.getQuestion().getAnswer3();
					}
					else if(t.getMarkedAnswer()==4)
					{
						answer=t.getQuestion().getAnswer4();
					}
						
				     if(answer.equalsIgnoreCase(t.getQuestion().getCorrectanswer()))
					    hm.put(t.getStudent(),count+1);
				}	
				return 0;
				
			}
			).forEach(t->System.out.println());
			return hm;
		 
	}*/
	
	
	
	
	public List<String> getTotalQuesDesignByTeacher() {
		List<TestQuestions> tq=tques.findAll();
		/*
		 * for(TestQuestions t:tq) { System.out.println(t); }
		 */	
		List<String> result=new ArrayList<String>();
		List<Object[]>  totalQuesDesignByTeacher  =tques.total_question_design_by_teacher();
	    for(Object[] t:totalQuesDesignByTeacher)
	    {
	    	//System.out.println("testid : "+t[0]+"  "+"   total_question_design_by_teacher : "+t[1]+"  "+"    teacherid: "+t[2]+" "+"    teachername : "+t[3]);
	    	String str="testid : "+t[0]+"  "+"   total_question_design_by_teacher : "+t[1]+"  "+"    teacherid: "+t[2]+" "+"    teachername : "+t[3];
	         result.add(str);
	    }
		return result;
	}
	
	
	public List<String> getTeacherNameAndTotalNumberOfTestCreated()
	{
		List<String> output=new ArrayList<String>();
       List<Object[]> result=testrepo.getTeacherNameAndTotalNumberOfTestCreated();
       for(Object[] t:result)
       {
    	   String str="teacherid :"+t[0]+" "+" total_test_created : "+t[1]+" "+" teacher name : "+t[2];   
    	   output.add(str);
       }
       return output;
	}
	
	public List<String> counttestGivenByStudent() {
		List<Object[]> result=sattrepo.counttestGivenByStudent();
		List<String> output=new ArrayList<String>();
		for(Object[] t:result)
		{
			 String str="student id: "+t[0]+"  "+" student name: "+t[1]+" "+" no of test given by student : "+t[2];
			 output.add(str);
		}	
		return output;
	}
	
	public int[] CalTotalCorrectAndAttemptQuesByStudents()
	{
		int ary[]= new int[2];
		List<StudentTestAttempt> list=sattrepo.findAll();
		System.out.println(list.size());
		int countmarks=0,totalmarks=0;
		for(StudentTestAttempt sta:list)
		{
			totalmarks++;
			System.out.println(sta);
			String answer="";
			if(sta.getMarkedAnswer()==1)
			{	
				answer=sta.getQuestion().getAnswer1();
				System.out.println("answer "+answer);
			}	
			else if(sta.getMarkedAnswer()==2)
			{
				answer=sta.getQuestion().getAnswer2();
				System.out.println("answer "+answer);
			}	
			else if(sta.getMarkedAnswer()==3)
			{
				answer=sta.getQuestion().getAnswer3();
				System.out.println("answer "+answer);
			}
			else if(sta.getMarkedAnswer()==4)
			{
				answer=sta.getQuestion().getAnswer4();
				System.out.println("answer "+answer);
			}
			
			System.out.println("correct answer "+sta.getQuestion().getCorrectanswer());
			if(sta.getQuestion().getCorrectanswer().trim().equalsIgnoreCase(answer.trim()))
			{
				
				countmarks++;
				System.out.println(countmarks);
			}	
			
		
		}	
		ary[0]=countmarks;
		ary[1]=totalmarks;
		System.out.println(ary[0]+"  "+ary[1]);
		return ary;
	}
	
	public double CalAvgWrongQuesAttemptByStudents() {
	
		int ary[]=CalTotalCorrectAndAttemptQuesByStudents();
		return ((ary[1]-ary[0])/ary[1]) ;
	}
	
	public double CalAvgCorrectQuesAttemptByStudents() {
		
		int ary[]=CalTotalCorrectAndAttemptQuesByStudents();
		System.out.println(ary[0]+"  "+ary[1]);
		return (ary[0]/ary[1]) ;
	}
	
	
	}

