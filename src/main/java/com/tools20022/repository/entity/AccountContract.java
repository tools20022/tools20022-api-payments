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
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountContract2;
import com.tools20022.repository.msg.AccountContract3;
import com.tools20022.repository.msg.AccountContract4;
import com.tools20022.repository.msg.ContractDocument1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContractDocument1
 * ContractDocument1}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Date on which the account and related services are expected to cease to
	 * be operational for the account owner.
	 * <p>
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
	public static final MMBusinessAttribute mmTargetClosingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract4.mmTargetClosingDate, AccountContract2.mmTargetClosingDate, AccountContract3.mmTargetClosingDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TargetClosingDate";
			definition = "Date on which the account and related services are expected to cease to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getTargetClosingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator urgencyFlag;
	/**
	 * Indicator that the change to the contract needs to be treated urgently.
	 * <p>
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
	public static final MMBusinessAttribute mmUrgencyFlag = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract4.mmUrgencyFlag, AccountContract2.mmUrgencyFlag, AccountContract3.mmUrgencyFlag);
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UrgencyFlag";
			definition = "Indicator that the change to the contract needs to be treated urgently.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getUrgencyFlag", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator removalIndicator;
	/**
	 * Indicates removal of the account. After removal, an account will not
	 * appear anymore in reports.
	 * <p>
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
	public static final MMBusinessAttribute mmRemovalIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract4.mmRemovalIndicator, AccountContract3.mmRemovalIndicator);
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemovalIndicator";
			definition = "Indicates removal of the account. After removal, an account will not appear anymore in reports.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getRemovalIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime targetGoLiveDate;
	/**
	 * Date on which the account and related services are expected to cease/to
	 * be operational for the account owner.
	 * <p>
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
	public static final MMBusinessAttribute mmTargetGoLiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract2.mmTargetGoLiveDate, AccountContract3.mmTargetGoLiveDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TargetGoLiveDate";
			definition = "Date on which the account and related services are expected to cease/to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getTargetGoLiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountService accountService;
	/**
	 * Operations on a bank account that are allowed as part of the services
	 * offered to the owners of a bank account,
	 * <p>
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
	public static final MMBusinessAssociationEnd mmAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account,";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.mmAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * Specifies the account which is managed by a contract.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account which is managed by a contract.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * Interest that applies to the account.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Interest that applies to the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected ISODateTime requestDate;
	/**
	 * Date of the request.
	 * <p>
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
	public static final MMBusinessAttribute mmRequestDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestDate";
			definition = "Date of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getRequestDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Mandate> accountAuthorisation;
	/**
	 * Specifies the services which are assigned to another party.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmAccountAuthorisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountAuthorisation";
			definition = "Specifies the services which are assigned to another party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.mmAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	protected TransactionChannelCode transactionChannel;
	/**
	 * Specifies the means by which the account owner submits the open account
	 * form.
	 * <p>
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
	public static final MMBusinessAttribute mmTransactionChannel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Specifies the means by which the account owner submits the open account form. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getTransactionChannel", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountContract";
				definition = "Agreement between an account servicer and an account owner about the services linked to an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmAccountContract, com.tools20022.repository.entity.AccountService.mmAccountContract,
						com.tools20022.repository.entity.Interest.mmRelatedAccountContract, com.tools20022.repository.entity.Mandate.mmAccountContract);
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

	public void setTargetClosingDate(ISODateTime targetClosingDate) {
		this.targetClosingDate = targetClosingDate;
	}

	public TrueFalseIndicator getUrgencyFlag() {
		return urgencyFlag;
	}

	public void setUrgencyFlag(TrueFalseIndicator urgencyFlag) {
		this.urgencyFlag = urgencyFlag;
	}

	public YesNoIndicator getRemovalIndicator() {
		return removalIndicator;
	}

	public void setRemovalIndicator(YesNoIndicator removalIndicator) {
		this.removalIndicator = removalIndicator;
	}

	public ISODateTime getTargetGoLiveDate() {
		return targetGoLiveDate;
	}

	public void setTargetGoLiveDate(ISODateTime targetGoLiveDate) {
		this.targetGoLiveDate = targetGoLiveDate;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(com.tools20022.repository.entity.AccountService accountService) {
		this.accountService = accountService;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = account;
	}

	public List<Interest> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = interest;
	}

	public ISODateTime getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(ISODateTime requestDate) {
		this.requestDate = requestDate;
	}

	public List<Mandate> getAccountAuthorisation() {
		return accountAuthorisation;
	}

	public void setAccountAuthorisation(List<com.tools20022.repository.entity.Mandate> accountAuthorisation) {
		this.accountAuthorisation = accountAuthorisation;
	}

	public TransactionChannelCode getTransactionChannel() {
		return transactionChannel;
	}

	public void setTransactionChannel(TransactionChannelCode transactionChannel) {
		this.transactionChannel = transactionChannel;
	}
}