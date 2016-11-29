package com.briup.book;

import static com.briup.command.utils.MyBatisSqlSessionFactoryUtil.openSession;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * 在BookMapper.java接口中定义方法 在BookService中调用BookMapper.java接口中方法
 * 完成以下功能(注意参照笔记中的实例)
 */
// 处理书籍相关信息的服务类
public class BookService {

	// 添加书籍
	// 书籍的名称不能重复
	
	@Test
	public  void addBook() {
		try {
			SqlSession session = openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			Book b1 = new Book(1,"java","alan",new Date(),10D);
			Book b2 = new Book(2,"c++","jade",new Date(),100D);
			Book b3 = new Book(3,"php","bob",new Date(),30D);
//			mapper.add(b1);
			mapper.add(b2);
			mapper.add(b3);
			session.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 删除书籍
	// id值不存在则不能删除
	public void removeBook(Integer id) {
		
	}

	// 查找书籍
	// 通过名字
	@Test
	public void findBookByName() {
		try {
			SqlSession session = openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			Book b = mapper.findBookByName("java");
			System.out.println(b);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 查找书籍
	// 通过id
	public Book findBookByName(Integer id) {

		return null;
	}

	// 查找所有书籍
	public List<Book> findAllBooks() {

		return null;
	}

	// 查找所有书籍的名字
	public List<String> findAllBooksName() {

		return null;
	}

	// 查找一共有多少本书籍
	public int findCountOfBook() {

		return 0;
	}

	// 修改书籍
	// 通过id确定修改的是那本书
	public void updateBook(Book book) {

	}

	// 查询所有书籍的名字和对应的作者
	public List<Map<String, Object>> findBookNameAndAuthor() {

		return null;
	}

}
