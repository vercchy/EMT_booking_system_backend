package mk.ukim.finki.lab1_emt_213064.mock_tests;

import jakarta.inject.Inject;
import mk.ukim.finki.lab1_emt_213064.model.Country;
import mk.ukim.finki.lab1_emt_213064.model.Host;
import mk.ukim.finki.lab1_emt_213064.repository.CountryRepository;
import mk.ukim.finki.lab1_emt_213064.repository.HostRepository;
import mk.ukim.finki.lab1_emt_213064.service.impl.HostServiceImpl;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.InjectingAnnotationEngine;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HostServiceImplMockTest {

    @Mock
    private HostRepository hostRepository;

    @Mock
    private CountryRepository countryRepository;

    @InjectMocks
    private HostServiceImpl hostService;

    @Test
    void findAllHosts()
    {
        List<Host> hostList = new ArrayList<>();
        hostList.add(new Host("Kristijan", "Stojanovski", new Country("Sweden", "Europe")));
        hostList.add(new Host("Verche", "Petrushevska", new Country("Finland", "Europe")));

        when(hostRepository.findAll()).thenReturn(hostList);
        List<Host> hosts = hostService.findAll();
        assertEquals(hosts.size(), 2);
    }
}
