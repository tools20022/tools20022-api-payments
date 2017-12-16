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
import com.tools20022.repository.codeset.ClearingSideCode;
import com.tools20022.repository.entity.SystemPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Member of an exchange's clearing corporation, responsible for executing
 * client trades and involved in the clearing of trades.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ClearingMemberRole" src="doc-files/ClearingMemberRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSystemMemberIdentification
 * ClearingMemberRole.mmClearingSystemMemberIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmSide
 * ClearingMemberRole.mmSide}</li>
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
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDefaultFundAccount
 * ClearingMemberRole.mmDefaultFundAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSegment
 * ClearingMemberRole.mmClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmRelatedClearingMemberRole
 * ClearingMemberRole.mmRelatedClearingMemberRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundAccountOwner
 * Account.mmDefaultFundAccountOwner}</li>
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
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmClearingMember
 * CashClearingSystemMember.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSegment
 * ClearingMemberRole.mmClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmRelatedClearingMemberRole
 * ClearingMemberRole.mmRelatedClearingMemberRole}</li>
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
 * "ClearingMemberRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Member of an exchange's clearing corporation, responsible for executing client trades and involved in the clearing of trades."
 * </li>
 * </ul>
 */
public class ClearingMemberRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashClearingSystemMember clearingSystemMemberIdentification;
	/**
	 * Unique and unambiguous identifier of a clearing system member, assigned
	 * by the system or system administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmClearingMember
	 * CashClearingSystemMember.mmClearingMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingSystemMemberIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmClearingMember;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
		}
	};
	protected ClearingSideCode side;
	/**
	 * Specifies the side of the clearing member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingSideCode
	 * ClearingSideCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the side of the clearing member."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSide = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Specifies the side of the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingSideCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ClearingMemberRole.class.getMethod("getSide", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> clearingAccount;
	/**
	 * Identifies the clearing member account at the CCP through which the trade
	 * must be cleared (sometimes called position account).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountOwner
	 * SecuritiesAccount.mmClearingAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingAccount";
			definition = "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> marginAccount;
	/**
	 * Margin account where the negociation and liquidation risks will be
	 * calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmMarginAccountOwner
	 * SecuritiesAccount.mmMarginAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin account where the negociation and liquidation risks will be calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMarginAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginAccount";
			definition = "Margin account where the negociation and liquidation risks will be calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmMarginAccountOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> deliveryAccount;
	/**
	 * Account opened by the central counterparty in the name of the clearing
	 * member within the account structure, for settlement purposes (gives
	 * information about the clearing member account at central counterparty).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDeliveryAccountOwner
	 * SecuritiesAccount.mmDeliveryAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account opened by the central counterparty in the name of the clearing member within the account structure, for settlement purposes (gives information about the clearing member account at central counterparty)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeliveryAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccount";
			definition = "Account opened by the central counterparty in the name of the clearing member within the account structure, for settlement purposes (gives information about the clearing member account at central counterparty).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmDeliveryAccountOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Account> defaultFundAccount;
	/**
	 * Specifies the account identification of the clearing member at the ICSD
	 * (International Central Securities Depository) or at the Central Bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundAccountOwner
	 * Account.mmDefaultFundAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the Central Bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDefaultFundAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccount";
			definition = "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the Central Bank.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmDefaultFundAccountOwner;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected ClearingMemberRole clearingSegment;
	/**
	 * Clearing segment within a clearing organisation that allows the
	 * segregation of flows coming from clearing counterparty's clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmRelatedClearingMemberRole
	 * ClearingMemberRole.mmRelatedClearingMemberRole}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSegment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing segment within a clearing organisation that allows the segregation of flows coming from clearing counterparty's clearing system. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingSegment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSegment";
			definition = "Clearing segment within a clearing organisation that allows the segregation of flows coming from clearing counterparty's clearing system. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmRelatedClearingMemberRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};
	protected ClearingMemberRole relatedClearingMemberRole;
	/**
	 * Clearing member for which a clearing segment is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSegment
	 * ClearingMemberRole.mmClearingSegment}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClearingMemberRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing member for which a clearing segment is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedClearingMemberRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedClearingMemberRole";
			definition = "Clearing member for which a clearing segment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmClearingSegment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingMemberRole";
				definition = "Member of an exchange's clearing corporation, responsible for executing client trades and involved in the clearing of trades.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmDefaultFundAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.mmMarginAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.mmDeliveryAccountOwner,
						com.tools20022.repository.entity.CashClearingSystemMember.mmClearingMember, com.tools20022.repository.entity.ClearingMemberRole.mmClearingSegment,
						com.tools20022.repository.entity.ClearingMemberRole.mmRelatedClearingMemberRole);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingMemberRole.mmClearingSystemMemberIdentification, com.tools20022.repository.entity.ClearingMemberRole.mmSide,
						com.tools20022.repository.entity.ClearingMemberRole.mmClearingAccount, com.tools20022.repository.entity.ClearingMemberRole.mmMarginAccount, com.tools20022.repository.entity.ClearingMemberRole.mmDeliveryAccount,
						com.tools20022.repository.entity.ClearingMemberRole.mmDefaultFundAccount, com.tools20022.repository.entity.ClearingMemberRole.mmClearingSegment,
						com.tools20022.repository.entity.ClearingMemberRole.mmRelatedClearingMemberRole);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ClearingMemberRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CashClearingSystemMember getClearingSystemMemberIdentification() {
		return clearingSystemMemberIdentification;
	}

	public void setClearingSystemMemberIdentification(com.tools20022.repository.entity.CashClearingSystemMember clearingSystemMemberIdentification) {
		this.clearingSystemMemberIdentification = clearingSystemMemberIdentification;
	}

	public ClearingSideCode getSide() {
		return side;
	}

	public void setSide(ClearingSideCode side) {
		this.side = side;
	}

	public List<SecuritiesAccount> getClearingAccount() {
		return clearingAccount;
	}

	public void setClearingAccount(List<com.tools20022.repository.entity.SecuritiesAccount> clearingAccount) {
		this.clearingAccount = clearingAccount;
	}

	public List<SecuritiesAccount> getMarginAccount() {
		return marginAccount;
	}

	public void setMarginAccount(List<com.tools20022.repository.entity.SecuritiesAccount> marginAccount) {
		this.marginAccount = marginAccount;
	}

	public List<SecuritiesAccount> getDeliveryAccount() {
		return deliveryAccount;
	}

	public void setDeliveryAccount(List<com.tools20022.repository.entity.SecuritiesAccount> deliveryAccount) {
		this.deliveryAccount = deliveryAccount;
	}

	public List<Account> getDefaultFundAccount() {
		return defaultFundAccount;
	}

	public void setDefaultFundAccount(List<com.tools20022.repository.entity.Account> defaultFundAccount) {
		this.defaultFundAccount = defaultFundAccount;
	}

	public ClearingMemberRole getClearingSegment() {
		return clearingSegment;
	}

	public void setClearingSegment(com.tools20022.repository.entity.ClearingMemberRole clearingSegment) {
		this.clearingSegment = clearingSegment;
	}

	public ClearingMemberRole getRelatedClearingMemberRole() {
		return relatedClearingMemberRole;
	}

	public void setRelatedClearingMemberRole(com.tools20022.repository.entity.ClearingMemberRole relatedClearingMemberRole) {
		this.relatedClearingMemberRole = relatedClearingMemberRole;
	}
}