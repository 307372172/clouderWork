package com.skyeye.test.dao;

import org.junit.Test;

public class AccountTest  {
    @Test
    public void test()
    {
		String aa=" select     rh.ID, rh.AccountName, rh.Password, rh.AccountType, rh.ADSLAccount, rh.MacAddr, rh.IPAddr,\n" +
				"        rh.CapTime, rh.CapPort, aty.TypeName TypeName\n" +
				"        from rawaccount_handled rh LEFT JOIN accounttype aty ON rh.accountType=aty.id\n" +
				"        where 1=1";

		System.out.printf(aa.substring(aa.indexOf("where")+5));
	}

	public static void main(String[] args) {
	}
}
