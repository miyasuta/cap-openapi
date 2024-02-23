type SimpleRoleCollection {
    name: String;
    description: String; 
}

service AuthorizationService {
    function getRoleCollections() returns array of  SimpleRoleCollection;
}