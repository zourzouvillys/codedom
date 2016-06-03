# CodeDom

Some tooling requires generating source code.  Rather than using a bunch of print statements or string builder, it's more maintainable to generate an in-memory model which represents the source code, and then use a visitor to generate the source code for the model.

This allows cross-cutting concerns such as indentation, escaping, etc to be handled in a single place.  In some cases, the same model could also be used for multiple languages (or different versions of the language).

netlibs codedom provides such an implementation.  Currently it's just for Java, however other languages will be added as needed (or pull requests).

## History

This code was initially part of a Java GraphQL implementation, but when the (author)[https://github.com/zourzouvillys] needed similar functionallity for the XANGKit project, it was moved into the netlibs repo.

