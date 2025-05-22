package com.example.demo.model.user;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

/**
 * ユーザー名を表現する値オブジェクト
 */
public class UserName {

	/**
	 * ユーザー名の値を保持するフィールド
	 * 値オブジェクトは値が変化しないので、finalとする
	 */
	private final String userName;

	/**
	 * コンストラクタ
	 * @param value ユーザー名
	 */
	public UserName(String value) {
		if (StringUtils.isBlank(value)) {
			throw new IllegalArgumentException("ユーザー名がnull、または空文字です");
		}
		this.userName = value;
	}

	/**
	 * getter
	 * @return ユーザー名
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * 等価性を確認するために定義
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof UserName)) {
			return false;
		}
		UserName other = (UserName) obj;
		return Objects.equals(this.getUserName(), other.getUserName());
	}
}
