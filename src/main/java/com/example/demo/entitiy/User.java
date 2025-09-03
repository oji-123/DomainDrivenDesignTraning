package com.example.demo.entitiy;

import com.example.demo.vo.UserId;
import com.example.demo.vo.UserName;

/**
 * Userエンティティ
 */
public class User {

	/** ユーザーID（値オブジェクト） */
	private final UserId id;

	/** ユーザー名（値オブジェクト） */
	private UserName name;

	/**
	 * コンストラクタ
	 * 
	 * @param id ユーザーID
	 * @param name ユーザー名
	 */
	public User(UserId id, UserName name) {
		if (id == null) {
			throw new IllegalArgumentException("UserId は null にできません");
		}
		if (name == null) {
			throw new IllegalArgumentException("UserName は null にできません");
		}

		this.id = id;
		this.name = name;
	}

	/**
	 * ユーザーID取得
	 */
	public UserId getId() {
		return id;
	}

	/**
	 * ユーザー名取得
	 */
	public UserName getName() {
		return name;
	}

	/**
	 * ユーザー名更新
	 */
	public void setName(UserName name) {
		if (name == null) {
			throw new IllegalArgumentException("UserName は null にできません");
		}
		this.name = name;
	}

	/**
	 * エンティティの同一性は UserId で判断
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof User)) {
			return false;
		}

		User other = (User) obj;
		return id.equals(other.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}