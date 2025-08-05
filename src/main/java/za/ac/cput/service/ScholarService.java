package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Scholar;
import za.ac.cput.repository.ScholarRepository;

@Service
public class ScholarService implements IScholarService{

    private final ScholarRepository scholarRepository;

    @Autowired
    public ScholarService(ScholarRepository scholarRepository) {
        this.scholarRepository = scholarRepository;
    }
    @Override
    public Scholar create(Scholar scholar) {
        return this.scholarRepository.save(scholar);
    }

    @Override
    public Scholar update(Scholar scholar) {
        return  this.scholarRepository.save(scholar);
    }

    @Override
    public Scholar read(Long id) {
        return this.scholarRepository.findById(id).orElse(null);
    }

    @Override
    public boolean delete(Long id) {
      this.scholarRepository.deleteById(id);
        return true;
    }
}
