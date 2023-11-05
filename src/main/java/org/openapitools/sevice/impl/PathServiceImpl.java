package org.openapitools.sevice.impl;

import org.openapitools.model.Path;
import org.openapitools.sevice.PathService;

import java.util.HashMap;
import java.util.Map;

public class PathServiceImpl implements PathService {

    Map<String, Path> paths = new HashMap<>();

    int PathValue;
    @Override
    public Path update(Path path) {
        paths.put("test",path);
        return path;
    }

    @Override
    public void delete() {
        paths.clear();
    }

    @Override
    public Path read() {
        return paths.get("test");
    }
}
