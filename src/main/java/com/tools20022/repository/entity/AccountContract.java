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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.TransactionChannelCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountContract2;
import com.tools20022.repository.msg.AccountContract3;
import com.tools20022.repository.msg.AccountContract4;
import com.tools20022.repository.msg.ContractDocument1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Agreement between an account servicer and an account owner about the services
 * linked to an account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountContract" src="doc-files/AccountContract.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTargetClosingDate
 * AccountContract.mmTargetClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmUrgencyFlag
 * AccountContract.mmUrgencyFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmRemovalIndicator
 * AccountContract.mmRemovalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTargetGoLiveDate
 * AccountContract.mmTargetGoLiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountService
 * AccountContract.mmAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmAccount
 * AccountContract.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
 * AccountContract.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmRequestDate
 * AccountContract.mmRequestDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountAuthorisation
 * AccountContract.mmAccountAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTransactionChannel
 * AccountContract.mmTransactionChannel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmAccountContract
 * Account.mmAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountContract
 * AccountService.mmAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAccountContract
 * Interest.mmRelatedAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAccountContract
 * Mandate.mmAccountContract}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccountContract
 * InvestmentAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContractDocument1
 * ContractDocument1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between an account servicer and an account owner about the services linked to an account."
 * </li>
 * </ul>
 */
public class AccountContract extends Contract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime targetClosingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract4#mmTargetClosingDate
	 * AccountContract4.mmTargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract2#mmTargetClosingDate
	 * AccountContract2.mmTargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmTargetClosingDate
	 * AccountContract3.mmTargetClosingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services are expected to cease to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountContract, ISODateTime> mmTargetClosingDate = new MMBusinessAttribute<AccountContract, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract4.mmTargetClosingDate, AccountContract2.mmTargetClosingDate, AccountContract3.mmTargetClosingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TargetClosingDate";
			definition = "Date on which the account and related services are expected to cease to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(AccountContract obj) {
			return obj.getTargetClosingDate();
		}

		@Override
		public void setValue(AccountContract obj, ISODateTime value) {
			obj.setTargetClosingDate(value);
		}
	};
	protected TrueFalseIndicator urgencyFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract4#mmUrgencyFlag
	 * AccountContract4.mmUrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract2#mmUrgencyFlag
	 * AccountContract2.mmUrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmUrgencyFlag
	 * AccountContract3.mmUrgencyFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UrgencyFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator that the change to the contract needs to be treated urgently."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountContract, TrueFalseIndicator> mmUrgencyFlag = new MMBusinessAttribute<AccountContract, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract4.mmUrgencyFlag, AccountContract2.mmUrgencyFlag, AccountContract3.mmUrgencyFlag);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UrgencyFlag";
			definition = "Indicator that the change to the contract needs to be treated urgently.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(AccountContract obj) {
			return obj.getUrgencyFlag();
		}

		@Override
		public void setValue(AccountContract obj, TrueFalseIndicator value) {
			obj.setUrgencyFlag(value);
		}
	};
	protected YesNoIndicator removalIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract4#mmRemovalIndicator
	 * AccountContract4.mmRemovalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmRemovalIndicator
	 * AccountContract3.mmRemovalIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemovalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates removal of the account. After removal, an account will not appear anymore in reports."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountContract, YesNoIndicator> mmRemovalIndicator = new MMBusinessAttribute<AccountContract, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract4.mmRemovalIndicator, AccountContract3.mmRemovalIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemovalIndicator";
			definition = "Indicates removal of the account. After removal, an account will not appear anymore in reports.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AccountContract obj) {
			return obj.getRemovalIndicator();
		}

		@Override
		public void setValue(AccountContract obj, YesNoIndicator value) {
			obj.setRemovalIndicator(value);
		}
	};
	protected ISODateTime targetGoLiveDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract2#mmTargetGoLiveDate
	 * AccountContract2.mmTargetGoLiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmTargetGoLiveDate
	 * AccountContract3.mmTargetGoLiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetGoLiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services are expected to cease/to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountContract, ISODateTime> mmTargetGoLiveDate = new MMBusinessAttribute<AccountContract, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract2.mmTargetGoLiveDate, AccountContract3.mmTargetGoLiveDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TargetGoLiveDate";
			definition = "Date on which the account and related services are expected to cease/to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(AccountContract obj) {
			return obj.getTargetGoLiveDate();
		}

		@Override
		public void setValue(AccountContract obj, ISODateTime value) {
			obj.setTargetGoLiveDate(value);
		}
	};
	protected AccountService accountService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountContract
	 * AccountService.mmAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account,"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountContract, com.tools20022.repository.entity.AccountService> mmAccountService = new MMBusinessAssociationEnd<AccountContract, com.tools20022.repository.entity.AccountService>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account,";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.mmAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.AccountService getValue(AccountContract obj) {
			return obj.getAccountService();
		}

		@Override
		public void setValue(AccountContract obj, com.tools20022.repository.entity.AccountService value) {
			obj.setAccountService(value);
		}
	};
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmAccountContract
	 * Account.mmAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the account which is managed by a contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountContract, List<Account>> mmAccount = new MMBusinessAssociationEnd<AccountContract, List<Account>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account which is managed by a contract.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}

		@Override
		public List<Account> getValue(AccountContract obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountContract obj, List<Account> value) {
			obj.setAccount(value);
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAccountContract
	 * Interest.mmRelatedAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest that applies to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountContract, List<Interest>> mmInterest = new MMBusinessAssociationEnd<AccountContract, List<Interest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Interest that applies to the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}

		@Override
		public List<Interest> getValue(AccountContract obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(AccountContract obj, List<Interest> value) {
			obj.setInterest(value);
		}
	};
	protected ISODateTime requestDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountContract, ISODateTime> mmRequestDate = new MMBusinessAttribute<AccountContract, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestDate";
			definition = "Date of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(AccountContract obj) {
			return obj.getRequestDate();
		}

		@Override
		public void setValue(AccountContract obj, ISODateTime value) {
			obj.setRequestDate(value);
		}
	};
	protected List<Mandate> accountAuthorisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmAccountContract
	 * Mandate.mmAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the services which are assigned to another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AccountContract, List<Mandate>> mmAccountAuthorisation = new MMBusinessAssociationEnd<AccountContract, List<Mandate>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountAuthorisation";
			definition = "Specifies the services which are assigned to another party.";
			minOccurs = 0;
			opposite_lazy = () -> Mandate.mmAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Mandate.mmObject();
		}

		@Override
		public List<Mandate> getValue(AccountContract obj) {
			return obj.getAccountAuthorisation();
		}

		@Override
		public void setValue(AccountContract obj, List<Mandate> value) {
			obj.setAccountAuthorisation(value);
		}
	};
	protected TransactionChannelCode transactionChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the means by which the account owner submits the open account form. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AccountContract, TransactionChannelCode> mmTransactionChannel = new MMBusinessAttribute<AccountContract, TransactionChannelCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Specifies the means by which the account owner submits the open account form. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}

		@Override
		public TransactionChannelCode getValue(AccountContract obj) {
			return obj.getTransactionChannel();
		}

		@Override
		public void setValue(AccountContract obj, TransactionChannelCode value) {
			obj.setTransactionChannel(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountContract";
				definition = "Agreement between an account servicer and an account owner about the services linked to an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmAccountContract, com.tools20022.repository.entity.AccountService.mmAccountContract,
						com.tools20022.repository.entity.Interest.mmRelatedAccountContract, Mandate.mmAccountContract);
				subType_lazy = () -> Arrays.asList(InvestmentAccountContract.mmObject(), CashAccountContract.mmObject());
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountContract.mmTargetClosingDate, com.tools20022.repository.entity.AccountContract.mmUrgencyFlag,
						com.tools20022.repository.entity.AccountContract.mmRemovalIndicator, com.tools20022.repository.entity.AccountContract.mmTargetGoLiveDate, com.tools20022.repository.entity.AccountContract.mmAccountService,
						com.tools20022.repository.entity.AccountContract.mmAccount, com.tools20022.repository.entity.AccountContract.mmInterest, com.tools20022.repository.entity.AccountContract.mmRequestDate,
						com.tools20022.repository.entity.AccountContract.mmAccountAuthorisation, com.tools20022.repository.entity.AccountContract.mmTransactionChannel);
				derivationComponent_lazy = () -> Arrays.asList(ContractDocument1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountContract.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getTargetClosingDate() {
		return targetClosingDate;
	}

	public AccountContract setTargetClosingDate(ISODateTime targetClosingDate) {
		this.targetClosingDate = Objects.requireNonNull(targetClosingDate);
		return this;
	}

	public TrueFalseIndicator getUrgencyFlag() {
		return urgencyFlag;
	}

	public AccountContract setUrgencyFlag(TrueFalseIndicator urgencyFlag) {
		this.urgencyFlag = Objects.requireNonNull(urgencyFlag);
		return this;
	}

	public YesNoIndicator getRemovalIndicator() {
		return removalIndicator;
	}

	public AccountContract setRemovalIndicator(YesNoIndicator removalIndicator) {
		this.removalIndicator = Objects.requireNonNull(removalIndicator);
		return this;
	}

	public ISODateTime getTargetGoLiveDate() {
		return targetGoLiveDate;
	}

	public AccountContract setTargetGoLiveDate(ISODateTime targetGoLiveDate) {
		this.targetGoLiveDate = Objects.requireNonNull(targetGoLiveDate);
		return this;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public AccountContract setAccountService(com.tools20022.repository.entity.AccountService accountService) {
		this.accountService = Objects.requireNonNull(accountService);
		return this;
	}

	public List<Account> getAccount() {
		return account == null ? account = new ArrayList<>() : account;
	}

	public AccountContract setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public List<Interest> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public AccountContract setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public ISODateTime getRequestDate() {
		return requestDate;
	}

	public AccountContract setRequestDate(ISODateTime requestDate) {
		this.requestDate = Objects.requireNonNull(requestDate);
		return this;
	}

	public List<Mandate> getAccountAuthorisation() {
		return accountAuthorisation == null ? accountAuthorisation = new ArrayList<>() : accountAuthorisation;
	}

	public AccountContract setAccountAuthorisation(List<Mandate> accountAuthorisation) {
		this.accountAuthorisation = Objects.requireNonNull(accountAuthorisation);
		return this;
	}

	public TransactionChannelCode getTransactionChannel() {
		return transactionChannel;
	}

	public AccountContract setTransactionChannel(TransactionChannelCode transactionChannel) {
		this.transactionChannel = Objects.requireNonNull(transactionChannel);
		return this;
	}
}