/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of fee being assessed of the customer for trade executions
 * at an exchange. Applicable for futures markets only at this time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#CBOEMember
 * ClearingFeeTypeCode.CBOEMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#NonMemberAndCustomer
 * ClearingFeeTypeCode.NonMemberAndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#EquityClearingMember
 * ClearingFeeTypeCode.EquityClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#FullAssociateMember
 * ClearingFeeTypeCode.FullAssociateMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#J106AndHFirms
 * ClearingFeeTypeCode.J106AndHFirms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#GICInterestHolders
 * ClearingFeeTypeCode.GICInterestHolders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#LesseeAnd106FFirms
 * ClearingFeeTypeCode.LesseeAnd106FFirms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#OtherOwnershipTypes
 * ClearingFeeTypeCode.OtherOwnershipTypes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#FirstYearOwnAccount
 * ClearingFeeTypeCode.FirstYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#SecondYearOwnAccount
 * ClearingFeeTypeCode.SecondYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#ThirdYearOwnAccount
 * ClearingFeeTypeCode.ThirdYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#FourthYearOwnAccount
 * ClearingFeeTypeCode.FourthYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#FifthYearOwnAccount
 * ClearingFeeTypeCode.FifthYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#MoreThanFiveYearOwnAccount
 * ClearingFeeTypeCode.MoreThanFiveYearOwnAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CBOE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingFeeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of fee being assessed of the customer for trade executions at an exchange. Applicable for futures markets only at this time."
 * </li>
 * </ul>
 */
public class ClearingFeeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Member of the Chicago Board Of Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBOE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CBOEMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Member of the Chicago Board Of Exchange."</li>
	 * </ul>
	 */
	public static final MMCode CBOEMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CBOEMember";
			definition = "Member of the Chicago Board Of Exchange.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "CBOE";
		}
	};
	/**
	 * Non-member and customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonMemberAndCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non-member and customer."</li>
	 * </ul>
	 */
	public static final MMCode NonMemberAndCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonMemberAndCustomer";
			definition = "Non-member and customer.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "NONM";
		}
	};
	/**
	 * Equity member and clearing member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equity member and clearing member."</li>
	 * </ul>
	 */
	public static final MMCode EquityClearingMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityClearingMember";
			definition = "Equity member and clearing member.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "EQCL";
		}
	};
	/**
	 * Full and associate member trading for own account and as floor brokers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullAssociateMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Full and associate member trading for own account and as floor brokers."
	 * </li>
	 * </ul>
	 */
	public static final MMCode FullAssociateMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullAssociateMember";
			definition = "Full and associate member trading for own account and as floor brokers.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "FUAS";
		}
	};
	/**
	 * 106.J and 106.H Firms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JANF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "J106AndHFirms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "106.J and 106.H Firms."</li>
	 * </ul>
	 */
	public static final MMCode J106AndHFirms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "J106AndHFirms";
			definition = "106.J and 106.H Firms.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "JANF";
		}
	};
	/**
	 * GIM, IDEM and COM Membership Interest Holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GICI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GICInterestHolders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "GIM, IDEM and COM Membership Interest Holders."</li>
	 * </ul>
	 */
	public static final MMCode GICInterestHolders = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GICInterestHolders";
			definition = "GIM, IDEM and COM Membership Interest Holders.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "GICI";
		}
	};
	/**
	 * Lessee and 106.F Employees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LESF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LesseeAnd106FFirms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lessee and 106.F Employees."</li>
	 * </ul>
	 */
	public static final MMCode LesseeAnd106FFirms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LesseeAnd106FFirms";
			definition = "Lessee and 106.F Employees.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "LESF";
		}
	};
	/**
	 * Miscellaneous type of clearing membership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherOwnershipTypes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Miscellaneous type of clearing membership."</li>
	 * </ul>
	 */
	public static final MMCode OtherOwnershipTypes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherOwnershipTypes";
			definition = "Miscellaneous type of clearing membership.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * First year delegate trading for his own account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTR1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstYearOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First year delegate trading for his own account."</li>
	 * </ul>
	 */
	public static final MMCode FirstYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstYearOwnAccount";
			definition = "First year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR1";
		}
	};
	/**
	 * Second year delegate trading for his own account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTR2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondYearOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Second year delegate trading for his own account."</li>
	 * </ul>
	 */
	public static final MMCode SecondYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondYearOwnAccount";
			definition = "Second year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR2";
		}
	};
	/**
	 * Third year delegate trading for his own account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTR3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdYearOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Third year delegate trading for his own account."</li>
	 * </ul>
	 */
	public static final MMCode ThirdYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdYearOwnAccount";
			definition = "Third year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR3";
		}
	};
	/**
	 * Fourth year delegate trading for his own account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTR4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FourthYearOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fourth year delegate trading for his own account."</li>
	 * </ul>
	 */
	public static final MMCode FourthYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FourthYearOwnAccount";
			definition = "Fourth year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR4";
		}
	};
	/**
	 * Fifth year delegate trading for his own account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YTR5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FifthYearOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fifth year delegate trading for his own account."</li>
	 * </ul>
	 */
	public static final MMCode FifthYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FifthYearOwnAccount";
			definition = "Fifth year delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "YTR5";
		}
	};
	/**
	 * Sixth year and beyond delegate trading for his own account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NYTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoreThanFiveYearOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sixth year and beyond delegate trading for his own account."</li>
	 * </ul>
	 */
	public static final MMCode MoreThanFiveYearOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoreThanFiveYearOwnAccount";
			definition = "Sixth year and beyond delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "NYTR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CBOE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingFeeTypeCode";
				definition = "Indicates the type of fee being assessed of the customer for trade executions at an exchange. Applicable for futures markets only at this time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingFeeTypeCode.CBOEMember, com.tools20022.repository.codeset.ClearingFeeTypeCode.NonMemberAndCustomer,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.EquityClearingMember, com.tools20022.repository.codeset.ClearingFeeTypeCode.FullAssociateMember,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.J106AndHFirms, com.tools20022.repository.codeset.ClearingFeeTypeCode.GICInterestHolders,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.LesseeAnd106FFirms, com.tools20022.repository.codeset.ClearingFeeTypeCode.OtherOwnershipTypes,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.FirstYearOwnAccount, com.tools20022.repository.codeset.ClearingFeeTypeCode.SecondYearOwnAccount,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.ThirdYearOwnAccount, com.tools20022.repository.codeset.ClearingFeeTypeCode.FourthYearOwnAccount,
						com.tools20022.repository.codeset.ClearingFeeTypeCode.FifthYearOwnAccount, com.tools20022.repository.codeset.ClearingFeeTypeCode.MoreThanFiveYearOwnAccount);
			}
		});
		return mmObject_lazy.get();
	}
}