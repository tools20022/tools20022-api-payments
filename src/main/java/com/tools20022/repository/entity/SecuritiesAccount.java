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
import com.tools20022.repository.codeset.ClearingAccountTypeCode;
import com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.msg.SecuritiesAccount19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesAccount" src="doc-files/SecuritiesAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesAccountType
 * SecuritiesAccount.SecuritiesAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedInvestmentAccount
 * SecuritiesAccount.RelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedTransfer
 * SecuritiesAccount.RelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesPartyRole
 * SecuritiesAccount.SecuritiesPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesAccount#Security
 * SecuritiesAccount.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedRegistrar
 * SecuritiesAccount.RelatedRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SafekeepingPlace
 * SecuritiesAccount.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesBalance
 * SecuritiesAccount.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#CorporateActionServicing
 * SecuritiesAccount.CorporateActionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedAllocation
 * SecuritiesAccount.RelatedAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SecuritiesEntry
 * SecuritiesAccount.SecuritiesEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#ClearingAccountOwner
 * SecuritiesAccount.ClearingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#MarginAccountOwner
 * SecuritiesAccount.MarginAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#DeliveryAccountOwner
 * SecuritiesAccount.DeliveryAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedPowerOfAttorney
 * SecuritiesAccount.RelatedPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedMeetingInstruction
 * SecuritiesAccount.RelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#ClearingAccountType
 * SecuritiesAccount.ClearingAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#RelatedOrder
 * SecuritiesAccount.RelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#DisclosedListTrading
 * SecuritiesAccount.DisclosedListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#AccountLink
 * SecuritiesAccount.AccountLink}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#SecuritiesAccount
 * Security.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SecuritiesAccount
 * InvestmentAccount.SecuritiesAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Account
 * SecuritiesTransfer.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingAccount
 * ClearingMemberRole.ClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#MarginAccount
 * ClearingMemberRole.MarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DeliveryAccount
 * ClearingMemberRole.DeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#SecuritiesAccount
 * SecuritiesPartyRole.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#SecuritiesAccount
 * SecuritiesEntry.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#RelatedSecuritiesAccount
 * SafekeepingPlace.RelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesAccount
 * SecuritiesBalance.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegistrarRole#RegistrarAccount
 * RegistrarRole.RegistrarAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#SecuritiesAccount
 * CorporateActionServicing.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderingAccount
 * SecuritiesOrder.OrderingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#AllocationAccount
 * Allocation.AllocationAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#SafekeepingAccount
 * InstructionForMeeting.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedAccount
 * PowerOfAttorney.AuthorisedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#SecuritiesAccount
 * AccountLink.SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#DisclosedListTradingAccount
 * DisclosedListTrading.DisclosedListTradingAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19
 * SecuritiesAccount19}</li>
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
 * "SecuritiesAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a securities entry is made."</li>
 * </ul>
 */
public class SecuritiesAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#Type
	 * SecuritiesAccount19.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount19.Type);
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccountType";
			definition = "Specifies the type of securities account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
		}
	};
	/**
	 * Investment account which contains a securities account to make securities
	 * movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#SecuritiesAccount
	 * InvestmentAccount.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account which contains a securities account to make securities movements."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account which contains a securities account to make securities movements.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the process which moves securities out of an account to another
	 * one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#Account
	 * SecuritiesTransfer.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the process which moves securities out of an account to another one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransfer";
			definition = "Specifies the process which moves securities out of an account to another one.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role which uses a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#SecuritiesAccount
	 * SecuritiesPartyRole.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role which uses a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a securities account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security which is held on the securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesAccount
	 * Security.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is held on the securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is held on the securities account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies where the financial instruments are registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegistrarRole#RegistrarAccount
	 * RegistrarRole.RegistrarAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegistrarRole
	 * RegistrarRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the financial instruments are registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedRegistrar = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRegistrar";
			definition = "Specifies where the financial instruments are registered.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> RegistrarRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegistrarRole.RegistrarAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location where the financial instruments are safekept.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#RelatedSecuritiesAccount
	 * SafekeepingPlace.RelatedSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location where the financial instruments are safekept."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Location where the financial instruments are safekept.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.RelatedSecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value of financial assets held by a person or an organisation. It is
	 * derived from the association between Account and Balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SecuritiesAccount
	 * SecuritiesBalance.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Actions taken in relation with the securities account in the context of
	 * the corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#SecuritiesAccount
	 * CorporateActionServicing.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actions taken in relation with the securities account in the context of the corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionServicing";
			definition = "Actions taken in relation with the securities account in the context of the corporate action.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allocation process for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#AllocationAccount
	 * Allocation.AllocationAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedAllocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAllocation";
			definition = "Allocation process for which an account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.AllocationAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Record of the movements into or out of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#SecuritiesAccount
	 * SecuritiesEntry.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesEntry
	 * SecuritiesEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of the movements into or out of an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing member which holds a clearing account at a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#ClearingAccount
	 * ClearingMemberRole.ClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a clearing account at a CCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingAccountOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountOwner";
			definition = "Clearing member which holds a clearing account at a CCP.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.ClearingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing member which holds a margin account at a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#MarginAccount
	 * ClearingMemberRole.MarginAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a margin account at a CCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarginAccountOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginAccountOwner";
			definition = "Clearing member which holds a margin account at a CCP.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.MarginAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing member which holds a delivery account at a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#DeliveryAccount
	 * ClearingMemberRole.DeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a delivery account at a CCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DeliveryAccountOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccountOwner";
			definition = "Clearing member which holds a delivery account at a CCP.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClearingMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.DeliveryAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Power of attorney related to the securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#AuthorisedAccount
	 * PowerOfAttorney.AuthorisedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney related to the securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPowerOfAttorney";
			definition = "Power of attorney related to the securities account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PowerOfAttorney.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.AuthorisedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Meeting instruction which specifies an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#SafekeepingAccount
	 * InstructionForMeeting.SafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeetingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting instruction which specifies an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedMeetingInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingInstruction";
			definition = "Meeting instruction which specifies an account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InstructionForMeeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.SafekeepingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the clearing account type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the clearing account type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingAccountType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountType";
			definition = "Specifies the clearing account type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ClearingAccountTypeCode.mmObject();
		}
	};
	/**
	 * Order process for which an ordering account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#OrderingAccount
	 * SecuritiesOrder.OrderingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order process for which an ordering account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order process for which an ordering account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Disclosed list trading process for which a trading account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#DisclosedListTradingAccount
	 * DisclosedListTrading.DisclosedListTradingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading
	 * DisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisclosedListTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disclosed list trading process for which a trading account is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DisclosedListTrading = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisclosedListTrading";
			definition = "Disclosed list trading process for which a trading account is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.DisclosedListTradingAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines the link between a cash account and a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#SecuritiesAccount
	 * AccountLink.SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountLink
	 * AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the link between a cash account and a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountLink = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.SecuritiesAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount";
				definition = "Account to or from which a securities entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesAccount, com.tools20022.repository.entity.InvestmentAccount.SecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesTransfer.Account, com.tools20022.repository.entity.ClearingMemberRole.ClearingAccount, com.tools20022.repository.entity.ClearingMemberRole.MarginAccount,
						com.tools20022.repository.entity.ClearingMemberRole.DeliveryAccount, com.tools20022.repository.entity.SecuritiesPartyRole.SecuritiesAccount, com.tools20022.repository.entity.SecuritiesEntry.SecuritiesAccount,
						com.tools20022.repository.entity.SafekeepingPlace.RelatedSecuritiesAccount, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesAccount, com.tools20022.repository.entity.RegistrarRole.RegistrarAccount,
						com.tools20022.repository.entity.CorporateActionServicing.SecuritiesAccount, com.tools20022.repository.entity.SecuritiesOrder.OrderingAccount, com.tools20022.repository.entity.Allocation.AllocationAccount,
						com.tools20022.repository.entity.InstructionForMeeting.SafekeepingAccount, com.tools20022.repository.entity.PowerOfAttorney.AuthorisedAccount, com.tools20022.repository.entity.AccountLink.SecuritiesAccount,
						com.tools20022.repository.entity.DisclosedListTrading.DisclosedListTradingAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.SecuritiesAccountType, com.tools20022.repository.entity.SecuritiesAccount.RelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedTransfer, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesPartyRole, com.tools20022.repository.entity.SecuritiesAccount.Security,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedRegistrar, com.tools20022.repository.entity.SecuritiesAccount.SafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesAccount.CorporateActionServicing, com.tools20022.repository.entity.SecuritiesAccount.RelatedAllocation, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesEntry,
						com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.MarginAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.DeliveryAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.RelatedPowerOfAttorney,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedMeetingInstruction, com.tools20022.repository.entity.SecuritiesAccount.ClearingAccountType, com.tools20022.repository.entity.SecuritiesAccount.RelatedOrder,
						com.tools20022.repository.entity.SecuritiesAccount.DisclosedListTrading, com.tools20022.repository.entity.SecuritiesAccount.AccountLink);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesAccount19.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}