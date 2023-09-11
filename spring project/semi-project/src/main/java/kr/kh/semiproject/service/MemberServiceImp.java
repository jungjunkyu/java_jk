package kr.kh.semiproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.semiproject.dao.MemberDAO;
import kr.kh.semiproject.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{
	
	@Autowired
	private MemberDAO memberDao;

	@Override
	public boolean signup(MemberVO member) {
		if(member == null || 
			member.getMe_id() == null || 
			member.getMe_pw() == null || 
			member.getMe_email() == null) {
			return false;
		}
		//유효성 검사
		if(!checkRegexMember(member)) {
			return false;
		}
		//아이디 중복체크
		//아이디로 회원정보를 가져옴
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		if(dbMember != null) {
			return false;
		}
		
		//회원가입 진행
		String encPw = passwordEncoder.encode(member.getMe_pw());
		member.setMe_pw(encPw);
		return memberDao.insertMember(member);
	}

	private boolean checkRegexMember(MemberVO member) {
		//필요하면 유효성 검사 코드를 구현
		return true;
	}
}


	

 