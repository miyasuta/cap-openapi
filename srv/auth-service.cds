type SimpleRoleCollection {
    name: String;
    description: String; 
}

service AuthorizationService {
    function getRoleCollections() returns array of  SimpleRoleCollection;
    action createRoleCollection(roleCollection:SimpleRoleCollection) returns SimpleRoleCollection;
}