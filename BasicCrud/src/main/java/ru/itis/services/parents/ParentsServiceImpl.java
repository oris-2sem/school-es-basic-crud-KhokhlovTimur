package ru.itis.services.parents;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import ru.itis.dto.parent.NewParentDto;
import ru.itis.dto.parent.ParentDto;
import ru.itis.exceptions.NotFoundException;
import ru.itis.mappers.ParentsMapper;
import ru.itis.models.Parent;
import ru.itis.repositories.ParentsRepository;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ParentsServiceImpl implements ParentsService{
    ParentsRepository parentsRepository;
    ParentsMapper parentsMapper;

    @Override
    public Parent findById(Long id) {
        return getOrThrow(id);
    }

    @Override
    public ParentDto findDtoById(Long id) {
        return parentsMapper.toDto(getOrThrow(id));
    }

    @Override
    public ParentDto add(NewParentDto parentDto) {
        return parentsMapper.toDto(parentsRepository.save(parentsMapper.toParent(parentDto)));
    }

    private Parent getOrThrow(Long id) {
        return parentsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Parent with id <" + id + "> not found"));
    }
}
