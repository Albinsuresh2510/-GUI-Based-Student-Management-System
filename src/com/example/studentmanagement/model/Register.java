package com.example.studentmanagement.model;

public class Register {
    private String Username;
    private String UniqueID;
    private String Password;
    private String ConfirmPassword;
    private String Role;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Username == null) ? 0 : Username.hashCode());
        result = prime * result + ((UniqueID == null) ? 0 : UniqueID.hashCode());
        result = prime * result + ((Password == null) ? 0 : Password.hashCode());
        result = prime * result + ((ConfirmPassword == null) ? 0 : ConfirmPassword.hashCode());
        result = prime * result + ((Role == null) ? 0 : Role.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Register other = (Register) obj;
        if (Username == null) {
            if (other.Username != null)
                return false;
        } else if (!Username.equals(other.Username))
            return false;
        if (UniqueID == null) {
            if (other.UniqueID != null)
                return false;
        } else if (!UniqueID.equals(other.UniqueID))
            return false;
        if (Password == null) {
            if (other.Password != null)
                return false;
        } else if (!Password.equals(other.Password))
            return false;
        if (ConfirmPassword == null) {
            if (other.ConfirmPassword != null)
                return false;
        } else if (!ConfirmPassword.equals(other.ConfirmPassword))
            return false;
        if (Role == null) {
            if (other.Role != null)
                return false;
        } else if (!Role.equals(other.Role))
            return false;
        return true;
    }
    public Register(String username, String uniqueID, String password, String confirmPassword, String role) {
        Username = username;
        UniqueID = uniqueID;
        Password = password;
        ConfirmPassword = confirmPassword;
        Role = role;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getUniqueID() {
        return UniqueID;
    }
    public void setUniqueID(String uniqueID) {
        UniqueID = uniqueID;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getConfirmPassword() {
        return ConfirmPassword;
    }
    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }
    public String getRole() {
        return Role;
    }
    public void setRole(String role) {
        Role = role;
    }


}
