package com.numi.io.common.json;
import java.util.List;

public class Root
{
    private Header header;

    private List<Body> body;

    public void setHeader(Header header){
        this.header = header;
    }
    public Header getHeader(){
        return this.header;
    }
    public void setBody(List<Body> body){
        this.body = body;
    }
    public List<Body> getBody(){
        return this.body;
    }
}