package org.dataone.ns.service.exceptions;

import javax.annotation.concurrent.ThreadSafe;

/**
 * The parameters provided in the call were invalid.
 * 
 * @see <a href="http://mule1.dataone.org/ArchitectureDocs-current/apis/Exceptions.html">
 *      https://mule1.dataone.org/ArchitectureDocs-current/apis/Exceptions.html</a>
 */
@ThreadSafe
public class InvalidRequest extends DataONEException {

  private static final long serialVersionUID = -8453320521331323991L;

  public InvalidRequest(String message) {
    super(message);
  }

  public InvalidRequest(String message, String detailCode) {
    super(message, detailCode, null, null);
  }

  public InvalidRequest(String message, String detailCode, String nodeId) {
    super(message, detailCode, nodeId, null);
  }

  public InvalidRequest(String message, String detailCode, String nodeId, Throwable cause) {
    super(message, detailCode, nodeId, null, cause);
  }

  public InvalidRequest(String message, String detailCode, Throwable cause) {
    super(message, detailCode, null, null, cause);
  }

  public InvalidRequest(String message, Throwable cause) {
    super(message, cause);
  }
}
