package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.mybatis.config.MyBatisConfig;
import com.app.vo.ProductVO;

public class ProductDAO {

	public SqlSession sqlSession;
	
	public ProductDAO() {
//		openSession(autoCommit)
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	상품 추가
	public void insert(ProductVO productVO) {
		sqlSession.insert("product.insert", productVO);
	}
//	상품 전체조회
//	상품 단일조회
//	상품 수정
//	상품 삭제
}
