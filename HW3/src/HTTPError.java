
public enum HTTPError {
	
	BAD_REQUEST("400. Bad Request"),
    UNAUTHORIZED("401. Unauthorized"),
    PAYMENT_REQUIRED ("402. Payment Required"),
    FORBIDDEN ("403. Forbidden"),
    NOT_FOUND ("404. Not Found"),
    METHOD_NOT_ALLOWED ("405. Method Not Allowed"),
    NOT_ACCEPTABLE ("406, Not Acceptable"),
    PROXY_AUTHENTICATION_REQUIRED ("407, Proxy Authentication Required");
    

    private String ErrorName;

    HTTPError(String ErrorName){
        this.ErrorName = ErrorName;
    }
    
    // Method to return Error code descriptions
    public String getErrorName (){
        return ErrorName;
    }

}
