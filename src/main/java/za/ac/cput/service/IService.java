package za.ac.cput.service;

public interface IService <T , ID>{

    T create(T t);
    T update(T t);
    T read(Long id);
    boolean delete(ID id);
}
