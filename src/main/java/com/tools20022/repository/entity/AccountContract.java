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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.TransactionChannelCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.msg.ContractDocument1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.AccountContract#TargetClosingDate
 * AccountContract.TargetClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#UrgencyFlag
 * AccountContract.UrgencyFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#RemovalIndicator
 * AccountContract.RemovalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#TargetGoLiveDate
 * AccountContract.TargetGoLiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#AccountService
 * AccountContract.AccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#Account
 * AccountContract.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#Interest
 * AccountContract.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#RequestDate
 * AccountContract.RequestDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#AccountAuthorisation
 * AccountContract.AccountAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#TransactionChannel
 * AccountContract.TransactionChannel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#AccountContract
 * Account.AccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#AccountContract
 * AccountService.AccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAccountContract
 * Interest.RelatedAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#AccountContract
 * Mandate.AccountContract}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountContract4#TargetClosingDate
	 * AccountContract4.TargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract2#TargetClosingDate
	 * AccountContract2.TargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#TargetClosingDate
	 * AccountContract3.TargetClosingDate}</li>
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
	public static final MMBusinessAttribute TargetClosingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract4.TargetClosingDate, com.tools20022.repository.msg.AccountContract2.TargetClosingDate,
					com.tools20022.repository.msg.AccountContract3.TargetClosingDate);
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TargetClosingDate";
			definition = "Date on which the account and related services are expected to cease to be operational for the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AccountContract4#UrgencyFlag
	 * AccountContract4.UrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract2#UrgencyFlag
	 * AccountContract2.UrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#UrgencyFlag
	 * AccountContract3.UrgencyFlag}</li>
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
	public static final MMBusinessAttribute UrgencyFlag = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract4.UrgencyFlag, com.tools20022.repository.msg.AccountContract2.UrgencyFlag, com.tools20022.repository.msg.AccountContract3.UrgencyFlag);
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UrgencyFlag";
			definition = "Indicator that the change to the contract needs to be treated urgently.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AccountContract4#RemovalIndicator
	 * AccountContract4.RemovalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#RemovalIndicator
	 * AccountContract3.RemovalIndicator}</li>
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
	public static final MMBusinessAttribute RemovalIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract4.RemovalIndicator, com.tools20022.repository.msg.AccountContract3.RemovalIndicator);
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemovalIndicator";
			definition = "Indicates removal of the account. After removal, an account will not appear anymore in reports.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AccountContract2#TargetGoLiveDate
	 * AccountContract2.TargetGoLiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#TargetGoLiveDate
	 * AccountContract3.TargetGoLiveDate}</li>
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
	public static final MMBusinessAttribute TargetGoLiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract2.TargetGoLiveDate, com.tools20022.repository.msg.AccountContract3.TargetGoLiveDate);
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TargetGoLiveDate";
			definition = "Date on which the account and related services are expected to cease/to be operational for the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Operations on a bank account that are allowed as part of the services
	 * offered to the owners of a bank account,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#AccountContract
	 * AccountService.AccountContract}</li>
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
	public static final MMBusinessAssociationEnd AccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account,";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.AccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the account which is managed by a contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#AccountContract
	 * Account.AccountContract}</li>
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
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account which is managed by a contract.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.AccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest that applies to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAccountContract
	 * Interest.RelatedAccountContract}</li>
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
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Interest that applies to the account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute RequestDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestDate";
			definition = "Date of the request.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the services which are assigned to another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#AccountContract
	 * Mandate.AccountContract}</li>
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
	public static final MMBusinessAssociationEnd AccountAuthorisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountAuthorisation";
			definition = "Specifies the services which are assigned to another party.";
			minOccurs = 0;
			type_lazy = () -> Mandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.AccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute TransactionChannel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Specifies the means by which the account owner submits the open account form. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountContract";
				definition = "Agreement between an account servicer and an account owner about the services linked to an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.AccountContract, com.tools20022.repository.entity.AccountService.AccountContract,
						com.tools20022.repository.entity.Interest.RelatedAccountContract, com.tools20022.repository.entity.Mandate.AccountContract);
				subType_lazy = () -> Arrays.asList(InvestmentAccountContract.mmObject(), CashAccountContract.mmObject());
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountContract.TargetClosingDate, com.tools20022.repository.entity.AccountContract.UrgencyFlag,
						com.tools20022.repository.entity.AccountContract.RemovalIndicator, com.tools20022.repository.entity.AccountContract.TargetGoLiveDate, com.tools20022.repository.entity.AccountContract.AccountService,
						com.tools20022.repository.entity.AccountContract.Account, com.tools20022.repository.entity.AccountContract.Interest, com.tools20022.repository.entity.AccountContract.RequestDate,
						com.tools20022.repository.entity.AccountContract.AccountAuthorisation, com.tools20022.repository.entity.AccountContract.TransactionChannel);
				derivationComponent_lazy = () -> Arrays.asList(ContractDocument1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}