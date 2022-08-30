package in.coll.com;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumConcept {

	//it is not sync.
	//faster than hashset
	//its highly performance
	//aal the methods are implemented using bitwise arithmetic operations==fast
		enum Lang{
			  JAVA,PYTHON,RUBY,SCALA,Sciene,Social,Maths
		  }
			public static void main(String[] args) {
			EnumSet<Lang> langs=EnumSet.allOf(Lang.class);
			System.out.println(langs);//to create new enumSet and print all enum values
			  
			 EnumSet<Lang> l =EnumSet.noneOf(Lang.class);
		System.out.println(l);//to create empty EnumSet

		//range e1,e2 (Upto)
		 EnumSet<Lang> la=EnumSet.range(Lang.JAVA, Lang.Sciene);
		 System.out.println(la);

		 //of method print only particular element.
		 EnumSet<Lang> of= EnumSet.of(Lang.PYTHON);
		  System.out.println(of);
		     
		  EnumSet<Lang> multiple=EnumSet.of(Lang.JAVA,Lang.Maths);
		  System.out.println(multiple); //diff.elements also
		  
		  //add and addAll methods
		  EnumSet<Lang> lang1=EnumSet.allOf(Lang.class);
		  EnumSet<Lang> lang2=EnumSet.noneOf(Lang.class);
		  lang2.add(Lang.Maths);
		  lang2.addAll(lang1);
		  System.out.println(lang2);
		  
		  //Iterating EnumSet
		    //Printing one by one using iterator method
		  EnumSet<Lang> fullLang=EnumSet.allOf(Lang.class);
		  Iterator<Lang> it=fullLang.iterator();
		  while(it.hasNext()){
			  System.out.println(it.next());
		  }
		  
		  //remove and removeAll methods
		  EnumSet<Lang> remove=EnumSet.allOf(Lang.class);
		  System.out.println(remove);
		  boolean b=remove.remove(Lang.Social);
		  System.out.println(b);
		  
		  boolean b1=remove.removeAll(fullLang);
		  System.out.println(b1);
		  System.out.println(remove);
	}

}
