/*
 * This file is generated by jOOQ.
*/
package com.ducnd.beginer.db.tables;


import com.ducnd.beginer.db.Demo;
import com.ducnd.beginer.db.Keys;
import com.ducnd.beginer.db.tables.records.UserRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 1658604613;

    /**
     * The reference instance of <code>demo.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>demo.user.id</code>.
     */
    public final TableField<UserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>demo.user.username</code>.
     */
    public final TableField<UserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>demo.user.password</code>.
     */
    public final TableField<UserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>demo.user.token</code>.
     */
    public final TableField<UserRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "");

    /**
     * The column <code>demo.user.devicetoken</code>.
     */
    public final TableField<UserRecord, String> DEVICETOKEN = createField("devicetoken", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "");

    /**
     * Create a <code>demo.user</code> table reference
     */
    public User() {
        this("user", null);
    }

    /**
     * Create an aliased <code>demo.user</code> table reference
     */
    public User(String alias) {
        this(alias, USER);
    }

    private User(String alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(String alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Demo.DEMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(name, null);
    }
}
