package com.softwaredevone.todolist.mapper;

public interface IMapper<I, O> {
	public O map(I in);
}
