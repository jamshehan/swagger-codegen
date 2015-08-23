package io.swagger.handler;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import io.swagger.model.*;

import io.swagger.model.User;
import java.util.*;

public class UserController  {

    public ResponseContext createUser(RequestContext request ,User body)
    {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
    public ResponseContext createUsersWithArrayInput(RequestContext request ,List<User> body)
    {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
    public ResponseContext createUsersWithListInput(RequestContext request ,List<User> body)
    {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
    public ResponseContext loginUser(RequestContext request ,String username,String password)
    {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
    public ResponseContext logoutUser(RequestContext request )
    {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
    public ResponseContext getUserByName(RequestContext request ,String username)
    {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
    public ResponseContext updateUser(RequestContext request ,String username,User body)
    {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
    public ResponseContext deleteUser(RequestContext request ,String username)
    {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
}
