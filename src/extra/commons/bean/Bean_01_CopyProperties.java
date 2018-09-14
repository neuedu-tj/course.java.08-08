package extra.commons.bean;



import extra.commons.collection.support.Emp;
import extra.commons.collection.support.Person;
import org.apache.commons.beanutils.BeanUtils;


public class Bean_01_CopyProperties {

	public static void main(String[] args) throws Exception {
		
		Person person = new Person();
		person.setAge(10);
		person.setName("tom");
		person.setOccupation("US");
		
//		Person empty = new Person();
		Emp emp = new Emp();
//
//		BeanUtils.copyProperties(empty, person); //PropertyUtils.copyProperties(dest, orig)
		BeanUtils.copyProperties(emp, person);
		
//		System.out.println(empty);
		System.out.println(emp);

		
		
	}

}
