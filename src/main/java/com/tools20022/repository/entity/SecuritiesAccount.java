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
import com.tools20022.repository.codeset.ClearingAccountTypeCode;
import com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesAccount19;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesAccount" src="doc-files/SecuritiesAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesAccountType
 * SecuritiesAccount.mmSecuritiesAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedInvestmentAccount
 * SecuritiesAccount.mmRelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedTransfer
 * SecuritiesAccount.mmRelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesPartyRole
 * SecuritiesAccount.mmSecuritiesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecurity
 * SecuritiesAccount.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedRegistrar
 * SecuritiesAccount.mmRelatedRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
 * SecuritiesAccount.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
 * SecuritiesAccount.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmCorporateActionServicing
 * SecuritiesAccount.mmCorporateActionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedAllocation
 * SecuritiesAccount.mmRelatedAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesEntry
 * SecuritiesAccount.mmSecuritiesEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountOwner
 * SecuritiesAccount.mmClearingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmMarginAccountOwner
 * SecuritiesAccount.mmMarginAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDeliveryAccountOwner
 * SecuritiesAccount.mmDeliveryAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedPowerOfAttorney
 * SecuritiesAccount.mmRelatedPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedMeetingInstruction
 * SecuritiesAccount.mmRelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountType
 * SecuritiesAccount.mmClearingAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedOrder
 * SecuritiesAccount.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDisclosedListTrading
 * SecuritiesAccount.mmDisclosedListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmAccountLink
 * SecuritiesAccount.mmAccountLink}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
 * Security.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSecuritiesAccount
 * InvestmentAccount.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
 * SecuritiesTransfer.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
 * ClearingMemberRole.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmMarginAccount
 * ClearingMemberRole.mmMarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
 * ClearingMemberRole.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecuritiesAccount
 * SecuritiesPartyRole.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesAccount
 * SecuritiesEntry.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmRelatedSecuritiesAccount
 * SafekeepingPlace.mmRelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
 * SecuritiesBalance.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegistrarRole#mmRegistrarAccount
 * RegistrarRole.mmRegistrarAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
 * CorporateActionServicing.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderingAccount
 * SecuritiesOrder.mmOrderingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocationAccount
 * Allocation.mmAllocationAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSafekeepingAccount
 * InstructionForMeeting.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedAccount
 * PowerOfAttorney.mmAuthorisedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmSecuritiesAccount
 * AccountLink.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmDisclosedListTradingAccount
 * DisclosedListTrading.mmDisclosedListTradingAccount}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected SecuritiesAccountPurposeTypeCode securitiesAccountType;
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
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmType
	 * SecuritiesAccount19.mmType}</li>
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
	public static final MMBusinessAttribute mmSecuritiesAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesAccount19.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccountType";
			definition = "Specifies the type of securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesAccount.class.getMethod("getSecuritiesAccountType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentAccount relatedInvestmentAccount;
	/**
	 * Investment account which contains a securities account to make securities
	 * movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSecuritiesAccount
	 * InvestmentAccount.mmSecuritiesAccount}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account which contains a securities account to make securities movements.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTransfer> relatedTransfer;
	/**
	 * Specifies the process which moves securities out of an account to another
	 * one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
	 * SecuritiesTransfer.mmAccount}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransfer";
			definition = "Specifies the process which moves securities out of an account to another one.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected SecuritiesPartyRole securitiesPartyRole;
	/**
	 * Specifies the role which uses a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecuritiesAccount
	 * SecuritiesPartyRole.mmSecuritiesAccount}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security which is held on the securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is held on the securities account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected RegistrarRole relatedRegistrar;
	/**
	 * Specifies where the financial instruments are registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegistrarRole#mmRegistrarAccount
	 * RegistrarRole.mmRegistrarAccount}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedRegistrar = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRegistrar";
			definition = "Specifies where the financial instruments are registered.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RegistrarRole.mmRegistrarAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegistrarRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace;
	/**
	 * Location where the financial instruments are safekept.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmRelatedSecuritiesAccount
	 * SafekeepingPlace.mmRelatedSecuritiesAccount}</li>
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
	public static final MMBusinessAssociationEnd mmSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Location where the financial instruments are safekept.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmRelatedSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance;
	/**
	 * Value of financial assets held by a person or an organisation. It is
	 * derived from the association between Account and Balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
	 * SecuritiesBalance.mmSecuritiesAccount}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionServicing> corporateActionServicing;
	/**
	 * Actions taken in relation with the securities account in the context of
	 * the corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
	 * CorporateActionServicing.mmSecuritiesAccount}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionServicing";
			definition = "Actions taken in relation with the securities account in the context of the corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}
	};
	protected Allocation relatedAllocation;
	/**
	 * Allocation process for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocationAccount
	 * Allocation.mmAllocationAccount}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAllocation";
			definition = "Allocation process for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmAllocationAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry;
	/**
	 * Record of the movements into or out of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesAccount
	 * SecuritiesEntry.mmSecuritiesAccount}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}
	};
	protected ClearingMemberRole clearingAccountOwner;
	/**
	 * Clearing member which holds a clearing account at a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
	 * ClearingMemberRole.mmClearingAccount}</li>
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
	public static final MMBusinessAssociationEnd mmClearingAccountOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountOwner";
			definition = "Clearing member which holds a clearing account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmClearingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};
	protected ClearingMemberRole marginAccountOwner;
	/**
	 * Clearing member which holds a margin account at a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmMarginAccount
	 * ClearingMemberRole.mmMarginAccount}</li>
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
	public static final MMBusinessAssociationEnd mmMarginAccountOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginAccountOwner";
			definition = "Clearing member which holds a margin account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmMarginAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};
	protected ClearingMemberRole deliveryAccountOwner;
	/**
	 * Clearing member which holds a delivery account at a CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
	 * ClearingMemberRole.mmDeliveryAccount}</li>
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
	public static final MMBusinessAssociationEnd mmDeliveryAccountOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccountOwner";
			definition = "Clearing member which holds a delivery account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmDeliveryAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};
	protected PowerOfAttorney relatedPowerOfAttorney;
	/**
	 * Power of attorney related to the securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedAccount
	 * PowerOfAttorney.mmAuthorisedAccount}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPowerOfAttorney";
			definition = "Power of attorney related to the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}
	};
	protected InstructionForMeeting relatedMeetingInstruction;
	/**
	 * Meeting instruction which specifies an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSafekeepingAccount
	 * InstructionForMeeting.mmSafekeepingAccount}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedMeetingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingInstruction";
			definition = "Meeting instruction which specifies an account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmSafekeepingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.mmObject();
		}
	};
	protected ClearingAccountTypeCode clearingAccountType;
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
	public static final MMBusinessAttribute mmClearingAccountType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountType";
			definition = "Specifies the clearing account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingAccountTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesAccount.class.getMethod("getClearingAccountType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * Order process for which an ordering account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderingAccount
	 * SecuritiesOrder.mmOrderingAccount}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order process for which an ordering account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected DisclosedListTrading disclosedListTrading;
	/**
	 * Disclosed list trading process for which a trading account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmDisclosedListTradingAccount
	 * DisclosedListTrading.mmDisclosedListTradingAccount}</li>
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
	public static final MMBusinessAssociationEnd mmDisclosedListTrading = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisclosedListTrading";
			definition = "Disclosed list trading process for which a trading account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmDisclosedListTradingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
		}
	};
	protected AccountLink accountLink;
	/**
	 * Defines the link between a cash account and a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmSecuritiesAccount
	 * AccountLink.mmSecuritiesAccount}</li>
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
	public static final MMBusinessAssociationEnd mmAccountLink = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount";
				definition = "Account to or from which a securities entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesAccount, com.tools20022.repository.entity.InvestmentAccount.mmSecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesTransfer.mmAccount, com.tools20022.repository.entity.ClearingMemberRole.mmClearingAccount, com.tools20022.repository.entity.ClearingMemberRole.mmMarginAccount,
						com.tools20022.repository.entity.ClearingMemberRole.mmDeliveryAccount, com.tools20022.repository.entity.SecuritiesPartyRole.mmSecuritiesAccount, com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesAccount,
						com.tools20022.repository.entity.SafekeepingPlace.mmRelatedSecuritiesAccount, com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesAccount,
						com.tools20022.repository.entity.RegistrarRole.mmRegistrarAccount, com.tools20022.repository.entity.CorporateActionServicing.mmSecuritiesAccount, com.tools20022.repository.entity.SecuritiesOrder.mmOrderingAccount,
						com.tools20022.repository.entity.Allocation.mmAllocationAccount, com.tools20022.repository.entity.InstructionForMeeting.mmSafekeepingAccount, com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedAccount,
						com.tools20022.repository.entity.AccountLink.mmSecuritiesAccount, com.tools20022.repository.entity.DisclosedListTrading.mmDisclosedListTradingAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesAccountType, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedTransfer, com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesPartyRole, com.tools20022.repository.entity.SecuritiesAccount.mmSecurity,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedRegistrar, com.tools20022.repository.entity.SecuritiesAccount.mmSafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesAccount.mmCorporateActionServicing, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedAllocation,
						com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesEntry, com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.mmMarginAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.mmDeliveryAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedPowerOfAttorney, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedMeetingInstruction,
						com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountType, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesAccount.mmDisclosedListTrading,
						com.tools20022.repository.entity.SecuritiesAccount.mmAccountLink);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesAccount19.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesAccount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccountPurposeTypeCode getSecuritiesAccountType() {
		return securitiesAccountType;
	}

	public void setSecuritiesAccountType(SecuritiesAccountPurposeTypeCode securitiesAccountType) {
		this.securitiesAccountType = securitiesAccountType;
	}

	public InvestmentAccount getRelatedInvestmentAccount() {
		return relatedInvestmentAccount;
	}

	public void setRelatedInvestmentAccount(com.tools20022.repository.entity.InvestmentAccount relatedInvestmentAccount) {
		this.relatedInvestmentAccount = relatedInvestmentAccount;
	}

	public List<SecuritiesTransfer> getRelatedTransfer() {
		return relatedTransfer;
	}

	public void setRelatedTransfer(List<com.tools20022.repository.entity.SecuritiesTransfer> relatedTransfer) {
		this.relatedTransfer = relatedTransfer;
	}

	public SecuritiesPartyRole getSecuritiesPartyRole() {
		return securitiesPartyRole;
	}

	public void setSecuritiesPartyRole(com.tools20022.repository.entity.SecuritiesPartyRole securitiesPartyRole) {
		this.securitiesPartyRole = securitiesPartyRole;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public RegistrarRole getRelatedRegistrar() {
		return relatedRegistrar;
	}

	public void setRelatedRegistrar(com.tools20022.repository.entity.RegistrarRole relatedRegistrar) {
		this.relatedRegistrar = relatedRegistrar;
	}

	public List<SafekeepingPlace> getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	public List<SecuritiesBalance> getSecuritiesBalance() {
		return securitiesBalance;
	}

	public void setSecuritiesBalance(List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance) {
		this.securitiesBalance = securitiesBalance;
	}

	public List<CorporateActionServicing> getCorporateActionServicing() {
		return corporateActionServicing;
	}

	public void setCorporateActionServicing(List<com.tools20022.repository.entity.CorporateActionServicing> corporateActionServicing) {
		this.corporateActionServicing = corporateActionServicing;
	}

	public Allocation getRelatedAllocation() {
		return relatedAllocation;
	}

	public void setRelatedAllocation(com.tools20022.repository.entity.Allocation relatedAllocation) {
		this.relatedAllocation = relatedAllocation;
	}

	public List<SecuritiesEntry> getSecuritiesEntry() {
		return securitiesEntry;
	}

	public void setSecuritiesEntry(List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry) {
		this.securitiesEntry = securitiesEntry;
	}

	public ClearingMemberRole getClearingAccountOwner() {
		return clearingAccountOwner;
	}

	public void setClearingAccountOwner(com.tools20022.repository.entity.ClearingMemberRole clearingAccountOwner) {
		this.clearingAccountOwner = clearingAccountOwner;
	}

	public ClearingMemberRole getMarginAccountOwner() {
		return marginAccountOwner;
	}

	public void setMarginAccountOwner(com.tools20022.repository.entity.ClearingMemberRole marginAccountOwner) {
		this.marginAccountOwner = marginAccountOwner;
	}

	public ClearingMemberRole getDeliveryAccountOwner() {
		return deliveryAccountOwner;
	}

	public void setDeliveryAccountOwner(com.tools20022.repository.entity.ClearingMemberRole deliveryAccountOwner) {
		this.deliveryAccountOwner = deliveryAccountOwner;
	}

	public PowerOfAttorney getRelatedPowerOfAttorney() {
		return relatedPowerOfAttorney;
	}

	public void setRelatedPowerOfAttorney(com.tools20022.repository.entity.PowerOfAttorney relatedPowerOfAttorney) {
		this.relatedPowerOfAttorney = relatedPowerOfAttorney;
	}

	public InstructionForMeeting getRelatedMeetingInstruction() {
		return relatedMeetingInstruction;
	}

	public void setRelatedMeetingInstruction(com.tools20022.repository.entity.InstructionForMeeting relatedMeetingInstruction) {
		this.relatedMeetingInstruction = relatedMeetingInstruction;
	}

	public ClearingAccountTypeCode getClearingAccountType() {
		return clearingAccountType;
	}

	public void setClearingAccountType(ClearingAccountTypeCode clearingAccountType) {
		this.clearingAccountType = clearingAccountType;
	}

	public SecuritiesOrder getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public DisclosedListTrading getDisclosedListTrading() {
		return disclosedListTrading;
	}

	public void setDisclosedListTrading(com.tools20022.repository.entity.DisclosedListTrading disclosedListTrading) {
		this.disclosedListTrading = disclosedListTrading;
	}

	public AccountLink getAccountLink() {
		return accountLink;
	}

	public void setAccountLink(com.tools20022.repository.entity.AccountLink accountLink) {
		this.accountLink = accountLink;
	}
}