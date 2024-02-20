type RoleCollection {
    name: String;
    description: String; 
}

service AuthorizationService {
    function getRoleCollections() returns array of  RoleCollection;
}