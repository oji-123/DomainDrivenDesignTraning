package com.example.demo.entitiy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.demo.vo.CircleId;
import com.example.demo.vo.CircleName;

/**
 * サークルエンティティ
 */
public class Circle {

	/** サークルID（値オブジェクト） */
	private final CircleId id;

	/** サークル名（値オブジェクト） */
	private CircleName name;

	/** サークルオーナー */
	private User owner;

	/** サークルメンバー */
	private List<User> members;

	/**
	 * コンストラクタ
	 * @param id サークルID
	 * @param name サークル名
	 * @param owner サークルオーナー
	 * @param members サークルメンバーリスト
	 */
	public Circle(CircleId id, CircleName name, User owner, List<User> members) {
		if (id == null) {
			throw new IllegalArgumentException("CircleId は null にできません");
		}
		if (name == null) {
			throw new IllegalArgumentException("CircleName は null にできません");
		}
		if (owner == null) {
			throw new IllegalArgumentException("owner は null にできません");
		}
		if (members == null) {
			throw new IllegalArgumentException("members は null にできません");
		}

		this.id = id;
		this.name = name;
		this.owner = owner;

		// 外部から渡されたリストをコピーして保持（外部変更を防止）
		this.members = new ArrayList<>(members);
	}

	/** getter */
	public CircleId getId() {
		return id;
	}

	public CircleName getName() {
		return name;
	}

	public User getOwner() {
		return owner;
	}

	/** メンバーリストは変更不可で取得する */
	public List<User> getMembers() {
		return Collections.unmodifiableList(members);
	}

	public void setName(CircleName name) {
		if (name == null)
			throw new IllegalArgumentException("CircleName は null にできません");
		this.name = name;
	}

	public void setOwner(User owner) {
		if (owner == null)
			throw new IllegalArgumentException("owner は null にできません");
		this.owner = owner;
	}

	public void setMembers(List<User> members) {
		if (members == null)
			throw new IllegalArgumentException("members は null にできません");
		this.members = new ArrayList<>(members);
	}

	/** エンティティの同一性は CircleId で判断 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Circle)) {
			return false;
		}

		Circle other = (Circle) obj;
		return id.equals(other.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}