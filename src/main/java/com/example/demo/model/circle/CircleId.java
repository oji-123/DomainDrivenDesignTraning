package com.example.demo.model.circle;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

/**
 * サークルのサークルIDを表現する値オブジェクト
 */
public class CircleId {

	/** 
	 * サークル名を保持するフィールド
	 * 値オブジェクトは値が変化しないので、finalとする
	 */
	private final String circleId;

	/** 
	 * コンストラクタ
	 */
	public CircleId(String value) {
		if (StringUtils.isBlank(value)) {
			throw new IllegalArgumentException("サークルIDがnull、または空文字です");
		}
		this.circleId = value;
	}

	/**
	 * getter
	 * @return サークルID
	 */
	public String getCircleId() {
		return this.circleId;
	}

	/** 
	 * 等価性を確認するために定義
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CircleId)) {
			return false;
		}
		CircleId other = (CircleId) obj;
		return Objects.equals(this.getCircleId(), other.getCircleId());
	}
}
