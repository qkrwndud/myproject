package com.spring.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.MemberVO;

@Repository //DAO라고 명시 (DAO를 스프링에서 인식시켜준다)
public class MemberDAOImpl implements MemberDAO{
	@Inject//의존관계를 자동으로 연결(JAVA에서 제공) ==@autowired(JAVA에서 제공)
	private SqlSession sqlSession;
	
	private static final String namespace ="com.spring.mapper.MemberMapper";
							//memberMapper의 namespace 값
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);
	}

}
