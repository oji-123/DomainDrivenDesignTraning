package com.example.demo.model.circle;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

/**
 * サークルのサークル名を表現する値オブジェクト
 */
public class CircleName {

	/** 
	 * サークル名を保持するフィールド
	 * 値オブジェクトは値が変化しないので、finalとする
	 */
	private final String circleName;

	/** 
	 * コンストラクタ
	 */
	public CircleName(String value) {
		if (StringUtils.isBlank(value) || value.length() < 3 || value.length() > 20) {
			throw new IllegalArgumentException("サークル名は3文字以上20文字以下である必要があります。");
		}
		this.circleName = value;
	}

	/**
	 * getter
	 * @return サークル名
	 */
	public String getCircleName() {
		return this.circleName;
	}

	/** 
	 * 等価性を確認するために定義
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CircleName)) {
			return false;
		}
		CircleName other = (CircleName) obj;
		return Objects.equals(this.getCircleName(), other.getCircleName());
	}
}
