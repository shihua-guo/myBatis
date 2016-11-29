package com.briup.book;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;
/**
 * 在BookMapper.java接口中定义方法
 * 在BookService中调用BookMapper.java接口中方法
 * 完成以下功能(注意参照笔记中的实例)
 */
//处理书籍相关信息的服务类
public class BookService2 {
	private static SqlSession session = openSession();
	private static BookMapper mapper = session.getMapper(BookMapper.class);
	
	public static void main(String[] args) {
		/**
		 * @date 2016-09-29 16:09:33
		 * 添加书*/
		/*
		Book b1 = new Book(4,"python","alan",new Date(),40D);
		Book b2 = new Book(2,"c++","jade",new Date(),100D);
		Book b3 = new Book(3,"php","bob",new Date(),30D);
		addBook(b1);*/
		
		/**
		 * @date 2016-09-29 16:11:33
		 * 通过书名查找书
		 */
		/*Book b = findBookByName("java");
		System.out.println(b);*/
		
		/**
		 * @date 2016-09-29 16:15:17
		 * 通过id查找书
		 */
		/*Book b = findBookById(1);
		System.out.println(b);*/
		
		/**
		 * @date 2016-09-29 16:18:36
		 * 查找所有书籍
		 */
		/*List<Book> bookList = findAllBooks();
		for(Book b:bookList){
			System.out.println(b);
		}*/
		
		/**
		 * @date 2016-09-29 16:39:37
		 * 查找所有书籍的名字
		 */
		/*List<String> bookNameList = findAllBooksName();
		for(String name:bookNameList){
			System.out.println(name);
		}*/
		
		/**
		 * @date 2016-09-29 16:42:46
		 * 查找有多少书籍
		 */
		/*int count = findCountOfBook();
		System.out.println("一共有"+count+"本书。");*/
		
		/**
		 * @date 2016-09-29 16:50:39
		 * 通过id查找book，再修改book
		 */
		/*Book b = new Book(1,"j2ee","alan",new Date(),60D);
		updateBook(b);*/
		
		/**
		 * @date 2016-09-29 16:59:27
		 * 查找所有书名和对应作者
		 */
		List<Map<String, String>> ba = findBookNameAndAuthor();
		for(Map m:ba){
			for(Object key:m.keySet()){
				System.out.print(key+":"+m.get(key)+",");
			}
			System.out.println();
		}
		
	}
	
	//添加书籍
	//书籍的名称不能重复
	public static void addBook(Book book){
		Book tmpBook =mapper.findBookByName(book.getBookName());
		if(tmpBook!=null){
			System.out.println("添加的书名重复！");
			return ;
		}
		mapper.add(book);
		session.commit();
	}
	
	//删除书籍
	//id值不存在则不能删除
	public void removeBook(Integer id){
		
	}
	
	//查找书籍
	//通过名字
	public static Book findBookByName(String bookName){
		Book b = mapper.findBookByName(bookName);
		if(b==null){
			System.out.println("找不到书籍！");
			return null;
		}
		return b;
	}
	
	//查找书籍
	//通过id
	public static Book findBookById(Integer id){
		Book b = mapper.findBookById(id);
		if(b==null){
			System.out.println("找不到书籍！");
		}
		return b;
	}
	
	//查找所有书籍
	public static List<Book> findAllBooks(){
		List<Book> bookList= mapper.findAllBooks();
		if(bookList==null){
			System.out.println("没有书籍！");
			return null;
		}
		return bookList;
	}
	
	//查找所有书籍的名字
	public static List<String> findAllBooksName(){
		List<String> bookNameList = mapper.findAllBooksName();
		if(bookNameList==null){
			System.out.println("没有书籍！");
			return null;
		}
		return bookNameList;
	}
	
	//查找一共有多少本书籍
	public static int findCountOfBook(){
		int count = mapper.findCountOfBook();
		if(count==0){
			System.out.println("没有书籍！");
		}
		return count;
	}
	
	//修改书籍
	//通过id确定修改的是那本书
	public static void updateBook(Book book){
		if(findBookById(book.getId())==null){
			return ;
		}
		mapper.updateBook(book);
		session.commit();
		System.out.println("修改成功！");
	}
	
	//查询所有书籍的名字和对应的作者
	public static List<Map<String,String>> findBookNameAndAuthor(){
		List<Map<String, String>> ba = mapper.findBookNameAndAuthor();
		if(ba==null){
			System.out.println("没有书籍");
			return null;
		}
		return ba;
	}
	
}
