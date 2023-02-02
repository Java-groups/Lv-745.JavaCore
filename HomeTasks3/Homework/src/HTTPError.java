public enum HTTPError {
    BadRequest("HTTP_ERROR_400_BadRequest"),
    Unauthorized("HTTP_ERROR_401_Unauthorized"),
    PaymentRequired("HTTP_ERROR_402_PaymentRequired"),
    Forbidden("HTTP_ERROR_403_Forbidden"),
    NotFound("HTTP_ERROR_404_NotFound"),
    MethodNotAllowed("HTTP_ERROR_405_MethodNotAllowed"),
    NotAcceptable("HTTP_ERROR_406_NotAcceptable"),
    ProxyAuthenticationRequired("HTTP_ERROR_407_ProxyAuthenticationRequired"),
    RequestTimeout("HTTP_ERROR_408_RequestTimeout"),
    Conflict("HTTP_ERROR_409_Conflict"),
    Gone("HTTP_ERROR_410_Gone"),
    LengthRequired("HTTP_ERROR_411_LengthRequired"),
    PreconditionFailed("HTTP_ERROR_412_PreconditionFailed"),
    RequestEntityTooLarge("HTTP_ERROR_413_RequestEntityTooLarge"),
    RequestURITooLong("HTTP_ERROR_414_RequestURITooLong"),
    UnsupportedMediaType("HTTP_ERROR_415_UnsupportedMediaType"),
    RequestedRangeNotSatisfiable("HTTP_ERROR_416_RequestedRangeNotSatisfiable"),
    ExpectationFailed("HTTP_ERROR_417_ExpectationFailed");

    private final String errorMessage;

    HTTPError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
