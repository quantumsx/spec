package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Path
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-05T08:42:00.069198300+04:00[Europe/Saratov]")
public class Path {

  private Integer savedPath;

  public Path() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Path(Integer savedPath) {
    this.savedPath = savedPath;
  }

  public Path savedPath(Integer savedPath) {
    this.savedPath = savedPath;
    return this;
  }

  /**
   * Номер пройденного пути
   * @return savedPath
  */
  @NotNull 
  @Schema(name = "savedPath", description = "Номер пройденного пути", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("savedPath")
  public Integer getSavedPath() {
    return savedPath;
  }

  public void setSavedPath(Integer savedPath) {
    this.savedPath = savedPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Path path = (Path) o;
    return Objects.equals(this.savedPath, path.savedPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savedPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Path {\n");
    sb.append("    savedPath: ").append(toIndentedString(savedPath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

