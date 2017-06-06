/**
 *NameRepository.java
 * Administrator
 *2017��6��6������4:05:17
 *
 */
package com.designpattern.a017IteratorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����4:05:17
 */
public class NameRepository implements Container {

	 public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
	 
	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a017IteratorPattern.Container#getIterator()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����4:05:17
	 */
	@Override
	public Iterator getIterator() {
		  return new NameIterator();
	}

   private class NameIterator implements Iterator {

	   int index;
	   
	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a017IteratorPattern.Iterator#hasNext()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����4:06:32
	*/
	@Override
	public boolean hasNext() {
		if(index < names.length){
            return true;
         }
         return false;
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a017IteratorPattern.Iterator#next()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����4:06:32
	*/
	@Override
	public Object next() {
		 if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	}
	   
   }
}
