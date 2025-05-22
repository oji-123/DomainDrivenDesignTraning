package com.example.demo.model.user;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

/**
 * ユーザーのIDを表現する値オブジェクト
 */
public class UserId {

	/**
	 * ユーザーIDの値を保持するフィールド
	 * 値オブジェクトは値が変化しないので、finalとする
	 */
	private final String userId;

	/**
	 * コンストラクタ
	 * @param value ユーザーID
	 */
	public UserId(String value) {
		if (StringUtils.isBlank(value)) {
			throw new IllegalArgumentException("ユーザーIDがnull、または空文字です");
		}
		this.userId = value;
	}

	/**
	 * getter
	 * @return ユーザーID
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * 等価性を確認するために定義
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof UserId)) {
			return false;
		}
		UserId other = (UserId) obj;
		return Objects.equals(this.getUserId(), other.getUserId());
	}
}