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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmCBOEMember
 * ClearingFeeTypeCode.mmCBOEMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmNonMemberAndCustomer
 * ClearingFeeTypeCode.mmNonMemberAndCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmEquityClearingMember
 * ClearingFeeTypeCode.mmEquityClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmFullAssociateMember
 * ClearingFeeTypeCode.mmFullAssociateMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmJ106AndHFirms
 * ClearingFeeTypeCode.mmJ106AndHFirms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmGICInterestHolders
 * ClearingFeeTypeCode.mmGICInterestHolders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmLesseeAnd106FFirms
 * ClearingFeeTypeCode.mmLesseeAnd106FFirms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmOtherOwnershipTypes
 * ClearingFeeTypeCode.mmOtherOwnershipTypes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmFirstYearOwnAccount
 * ClearingFeeTypeCode.mmFirstYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmSecondYearOwnAccount
 * ClearingFeeTypeCode.mmSecondYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmThirdYearOwnAccount
 * ClearingFeeTypeCode.mmThirdYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmFourthYearOwnAccount
 * ClearingFeeTypeCode.mmFourthYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmFifthYearOwnAccount
 * ClearingFeeTypeCode.mmFifthYearOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode#mmMoreThanFiveYearOwnAccount
 * ClearingFeeTypeCode.mmMoreThanFiveYearOwnAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	public static final MMCode mmCBOEMember = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmNonMemberAndCustomer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmEquityClearingMember = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmFullAssociateMember = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmJ106AndHFirms = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmGICInterestHolders = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmLesseeAnd106FFirms = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmOtherOwnershipTypes = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmFirstYearOwnAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmSecondYearOwnAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmThirdYearOwnAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmFourthYearOwnAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmFifthYearOwnAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode mmMoreThanFiveYearOwnAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoreThanFiveYearOwnAccount";
			definition = "Sixth year and beyond delegate trading for his own account.";
			owner_lazy = () -> ClearingFeeTypeCode.mmObject();
			codeName = "NYTR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CBOE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingFeeTypeCode";
				definition = "Indicates the type of fee being assessed of the customer for trade executions at an exchange. Applicable for futures markets only at this time.";
				code_lazy = () -> Arrays.asList(ClearingFeeTypeCode.mmCBOEMember, ClearingFeeTypeCode.mmNonMemberAndCustomer, ClearingFeeTypeCode.mmEquityClearingMember, ClearingFeeTypeCode.mmFullAssociateMember,
						ClearingFeeTypeCode.mmJ106AndHFirms, ClearingFeeTypeCode.mmGICInterestHolders, ClearingFeeTypeCode.mmLesseeAnd106FFirms, ClearingFeeTypeCode.mmOtherOwnershipTypes, ClearingFeeTypeCode.mmFirstYearOwnAccount,
						ClearingFeeTypeCode.mmSecondYearOwnAccount, ClearingFeeTypeCode.mmThirdYearOwnAccount, ClearingFeeTypeCode.mmFourthYearOwnAccount, ClearingFeeTypeCode.mmFifthYearOwnAccount,
						ClearingFeeTypeCode.mmMoreThanFiveYearOwnAccount);
			}
		});
		return mmObject_lazy.get();
	}
}