package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class person {
	private List<String> friends;
	private Map<String, Integer> feestructure;

	public List<String> getFriends() {
		return friends;
	}

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "person [friends=" + friends + ", feestructure=" + feestructure + "]";
	}

	

	}

