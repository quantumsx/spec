package org.openapitools.sevice;

import org.openapitools.model.Path;

public interface PathService {
    Path update(Path path);
    void delete();
    Path read();

}
