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
import com.tools20022.repository.codeset.AccountOwnershipTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of account ownership.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#JointAccountWithSurvivorshipRights
 * AccountOwnershipTypeCode.JointAccountWithSurvivorshipRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#JointAccountInCommon
 * AccountOwnershipTypeCode.JointAccountInCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#CustodialAccount
 * AccountOwnershipTypeCode.CustodialAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#SingleOwnerAccount
 * AccountOwnershipTypeCode.SingleOwnerAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#JointAccount
 * AccountOwnershipTypeCode.JointAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#Corporation
 * AccountOwnershipTypeCode.Corporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#FormalPartnership
 * AccountOwnershipTypeCode.FormalPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#FormalTrust
 * AccountOwnershipTypeCode.FormalTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#Nominee
 * AccountOwnershipTypeCode.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#NonProfitOrganisation
 * AccountOwnershipTypeCode.NonProfitOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#OtherNonIndividual
 * AccountOwnershipTypeCode.OtherNonIndividual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#EUResidualEntity
 * AccountOwnershipTypeCode.EUResidualEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#GovernmentOrganisation
 * AccountOwnershipTypeCode.GovernmentOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#LimitedLiabilityCompany
 * AccountOwnershipTypeCode.LimitedLiabilityCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#RegisteredInvestmentCompany
 * AccountOwnershipTypeCode.RegisteredInvestmentCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#Entrepreneurial
 * AccountOwnershipTypeCode.Entrepreneurial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#Unincorporated
 * AccountOwnershipTypeCode.Unincorporated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode#LimitedPartnership
 * AccountOwnershipTypeCode.LimitedPartnership}</li>
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
 * <li>"JOIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOwnershipTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of account ownership."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountOwnershipTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Two or more individuals own shares of the same account. Upon the death of
	 * one of the account owners, the entire account ownership is passed onto
	 * the surviving owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JOIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccountWithSurvivorshipRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Two or more individuals own shares of the same account. Upon the death of one of the account owners, the entire account ownership is passed onto the surviving owners."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode JointAccountWithSurvivorshipRights = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "JointAccountWithSurvivorshipRights";
			definition = "Two or more individuals own shares of the same account. Upon the death of one of the account owners, the entire account ownership is passed onto the surviving owners.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "JOIN";
		}
	};
	/**
	 * Two or more individuals of legal age own shares of the same account. Upon
	 * the death of one of the account owners, the respective percentage of the
	 * ownership is transferred to the deceased's estate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccountInCommon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Two or more individuals of legal age own shares of the same account. Upon the death of one of the account owners, the respective percentage of the ownership is transferred to the deceased's estate."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode JointAccountInCommon = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "JointAccountInCommon";
			definition = "Two or more individuals of legal age own shares of the same account. Upon the death of one of the account owners, the respective percentage of the ownership is transferred to the deceased's estate.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "COMO";
		}
	};
	/**
	 * Minor's account, registered in the minor's name. Since the minor cannot
	 * legally own property, the custodian of the account maintains control of
	 * the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodialAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minor's account, registered in the minor's name. Since the minor cannot legally own property, the custodian of the account maintains control of the account."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode CustodialAccount = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustodialAccount";
			definition = "Minor's account, registered in the minor's name. Since the minor cannot legally own property, the custodian of the account maintains control of the account.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Account has only one individual owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleOwnerAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account has only one individual owner."</li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode SingleOwnerAccount = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SingleOwnerAccount";
			definition = "Account has only one individual owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "SIGL";
		}
	};
	/**
	 * Two or more individuals of legal age own shares of the same account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JOIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Two or more individuals of legal age own shares of the same account."</li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode JointAccount = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "JointAccount";
			definition = "Two or more individuals of legal age own shares of the same account.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "JOIT";
		}
	};
	/**
	 * Account owner is a corporate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account owner is a corporate."</li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode Corporation = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Corporation";
			definition = "Account owner is a corporate.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Account owner is a contractual business organisation in which two or more
	 * individuals agree to pool their funds to manage and operate a business.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormalPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner is a contractual business organisation in which two or more individuals agree to pool their funds to manage and operate a business."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode FormalPartnership = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FormalPartnership";
			definition = "Account owner is a contractual business organisation in which two or more individuals agree to pool their funds to manage and operate a business.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Account owner is an organisation which is engaged as a trustee for
	 * individuals or businesses in the administration of services such as stock
	 * transfer, registration, trust funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormalTrust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner is an organisation which is engaged as a trustee for individuals or businesses in the administration of services such as stock transfer, registration, trust funds."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode FormalTrust = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FormalTrust";
			definition = "Account owner is an organisation which is engaged as a trustee for individuals or businesses in the administration of services such as stock transfer, registration, trust funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "TRUS";
		}
	};
	/**
	 * Account owner is a person or firm into whose name securities or other
	 * properties are transferred in order to facilitate transactions whilst
	 * leaving the customer as the actual owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner is a person or firm into whose name securities or other properties are transferred in order to facilitate transactions whilst leaving the customer as the actual owner."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode Nominee = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Nominee";
			definition = "Account owner is a person or firm into whose name securities or other properties are transferred in order to facilitate transactions whilst leaving the customer as the actual owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * Account owner is an association that is given tax-free status due to the
	 * nature of their activities such as charity organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonProfitOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner is an association that is given tax-free status due to the nature of their activities such as charity organisation."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode NonProfitOrganisation = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonProfitOrganisation";
			definition = "Account owner is an association that is given tax-free status due to the nature of their activities such as charity organisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "NFPO";
		}
	};
	/**
	 * Account owner is another type of non individual organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonIndividual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner is another type of non individual organisation."</li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode OtherNonIndividual = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherNonIndividual";
			definition = "Account owner is another type of non individual organisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "ONIS";
		}
	};
	/**
	 * Account owner is an entity located in the European Union which can be
	 * considered neither as a legal entity (for example, company, corporate),
	 * nor as an individual person, nor as a UCITS (Undertakings for Collective
	 * Investment of Transferable Securities) fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EURE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUResidualEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner is an entity located in the European Union which can be considered neither as a legal entity (for example, company, corporate), nor as an individual person, nor as a UCITS (Undertakings for Collective Investment of Transferable Securities) fund."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode EUResidualEntity = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUResidualEntity";
			definition = "Account owner is an entity located in the European Union which can be considered neither as a legal entity (for example, company, corporate), nor as an individual person, nor as a UCITS (Undertakings for Collective Investment of Transferable Securities) fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "EURE";
		}
	};
	/**
	 * Account owner is a government organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account owner is a government organisation."</li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode GovernmentOrganisation = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernmentOrganisation";
			definition = "Account owner is a government organisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "GOVO";
		}
	};
	/**
	 * Account is for a limited liability company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LLCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedLiabilityCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for a limited liability company."</li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode LimitedLiabilityCompany = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitedLiabilityCompany";
			definition = "Account is for a limited liability company.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "LLCO";
		}
	};
	/**
	 * Account is for a registered investment company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RGIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredInvestmentCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for a registered investment company."</li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode RegisteredInvestmentCompany = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredInvestmentCompany";
			definition = "Account is for a registered investment company.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "RGIC";
		}
	};
	/**
	 * Entrepreneurial account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entrepreneurial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entrepreneurial account."</li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode Entrepreneurial = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entrepreneurial";
			definition = "Entrepreneurial account.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "ENTR";
		}
	};
	/**
	 * Account owner is an unincorporated partnership or is of sole
	 * proprietorship.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unincorporated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner is an unincorporated partnership or is of sole proprietorship."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode Unincorporated = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unincorporated";
			definition = "Account owner is an unincorporated partnership or is of sole proprietorship.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "UNCO";
		}
	};
	/**
	 * Account owner is a limited partnership or is of sole proprietorship.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
	 * AccountOwnershipTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner is a limited partnership or is of sole proprietorship."</li>
	 * </ul>
	 */
	public static final AccountOwnershipTypeCode LimitedPartnership = new AccountOwnershipTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitedPartnership";
			definition = "Account owner is a limited partnership or is of sole proprietorship.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipTypeCode.mmObject();
			codeName = "LIPA";
		}
	};
	final static private LinkedHashMap<String, AccountOwnershipTypeCode> codesByName = new LinkedHashMap<>();

	protected AccountOwnershipTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("JOIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOwnershipTypeCode";
				definition = "Specifies the type of account ownership.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountOwnershipTypeCode.JointAccountWithSurvivorshipRights, com.tools20022.repository.codeset.AccountOwnershipTypeCode.JointAccountInCommon,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.CustodialAccount, com.tools20022.repository.codeset.AccountOwnershipTypeCode.SingleOwnerAccount,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.JointAccount, com.tools20022.repository.codeset.AccountOwnershipTypeCode.Corporation,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.FormalPartnership, com.tools20022.repository.codeset.AccountOwnershipTypeCode.FormalTrust,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.Nominee, com.tools20022.repository.codeset.AccountOwnershipTypeCode.NonProfitOrganisation,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.OtherNonIndividual, com.tools20022.repository.codeset.AccountOwnershipTypeCode.EUResidualEntity,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.GovernmentOrganisation, com.tools20022.repository.codeset.AccountOwnershipTypeCode.LimitedLiabilityCompany,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.RegisteredInvestmentCompany, com.tools20022.repository.codeset.AccountOwnershipTypeCode.Entrepreneurial,
						com.tools20022.repository.codeset.AccountOwnershipTypeCode.Unincorporated, com.tools20022.repository.codeset.AccountOwnershipTypeCode.LimitedPartnership);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(JointAccountWithSurvivorshipRights.getCodeName().get(), JointAccountWithSurvivorshipRights);
		codesByName.put(JointAccountInCommon.getCodeName().get(), JointAccountInCommon);
		codesByName.put(CustodialAccount.getCodeName().get(), CustodialAccount);
		codesByName.put(SingleOwnerAccount.getCodeName().get(), SingleOwnerAccount);
		codesByName.put(JointAccount.getCodeName().get(), JointAccount);
		codesByName.put(Corporation.getCodeName().get(), Corporation);
		codesByName.put(FormalPartnership.getCodeName().get(), FormalPartnership);
		codesByName.put(FormalTrust.getCodeName().get(), FormalTrust);
		codesByName.put(Nominee.getCodeName().get(), Nominee);
		codesByName.put(NonProfitOrganisation.getCodeName().get(), NonProfitOrganisation);
		codesByName.put(OtherNonIndividual.getCodeName().get(), OtherNonIndividual);
		codesByName.put(EUResidualEntity.getCodeName().get(), EUResidualEntity);
		codesByName.put(GovernmentOrganisation.getCodeName().get(), GovernmentOrganisation);
		codesByName.put(LimitedLiabilityCompany.getCodeName().get(), LimitedLiabilityCompany);
		codesByName.put(RegisteredInvestmentCompany.getCodeName().get(), RegisteredInvestmentCompany);
		codesByName.put(Entrepreneurial.getCodeName().get(), Entrepreneurial);
		codesByName.put(Unincorporated.getCodeName().get(), Unincorporated);
		codesByName.put(LimitedPartnership.getCodeName().get(), LimitedPartnership);
	}

	public static AccountOwnershipTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountOwnershipTypeCode[] values() {
		AccountOwnershipTypeCode[] values = new AccountOwnershipTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountOwnershipTypeCode> {
		@Override
		public AccountOwnershipTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountOwnershipTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}