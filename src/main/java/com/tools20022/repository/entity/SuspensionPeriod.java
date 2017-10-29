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
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Period defining the last date for which an action will be accepted and the
 * date on which the suspension will be released and normal processing will
 * resume.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SuspensionPeriod" src="doc-files/SuspensionPeriod.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#PrivilegeSuspensionPeriod
 * SuspensionPeriod.PrivilegeSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawal
 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForBookEntryTransfer
 * SuspensionPeriod.DepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForDepositAtAgent
 * SuspensionPeriod.DepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForDeposit
 * SuspensionPeriod.DepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForPledge
 * SuspensionPeriod.DepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForSegregation
 * SuspensionPeriod.DepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawalAtAgent
 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawalInNomineeName
 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#DepositorySuspensionPeriodForWithdrawalInStreetName
 * SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#CoDepositoriesSuspensionPeriod
 * SuspensionPeriod.CoDepositoriesSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#CorporateActionEvent
 * SuspensionPeriod.CorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PrivilegeSuspensionCorporateAction
 * DateTimePeriod.PrivilegeSuspensionCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalSuspensionRelatedEvent
 * DateTimePeriod.WithdrawalSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BookEntryTransferSuspensionRelatedEvent
 * DateTimePeriod.BookEntryTransferSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#DepositAtAgentSuspensionRelatedEvent
 * DateTimePeriod.DepositAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#DepositSuspensionRelatedEvent
 * DateTimePeriod.DepositSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PledgeSuspensionRelatedEvent
 * DateTimePeriod.PledgeSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SegregationPeriodRelatedEvent
 * DateTimePeriod.SegregationPeriodRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalAtAgentSuspensionRelatedEvent
 * DateTimePeriod.WithdrawalAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalInNomineeNameSuspensionRelatedEvent
 * DateTimePeriod.WithdrawalInNomineeNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalInStreetNameSuspensionRelatedEvent
 * DateTimePeriod.WithdrawalInStreetNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CoDepositoriesSuspensionRelatedEvent
 * DateTimePeriod.CoDepositoriesSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SuspensionPeriod
 * CorporateActionEvent.SuspensionPeriod}</li>
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
 * "SuspensionPeriod"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume."
 * </li>
 * </ul>
 */
public class SuspensionPeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Period during which the privilege is not available, eg, this can happen
	 * whenever a meeting takes place or whenever a coupon payment is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PrivilegeSuspensionCorporateAction
	 * DateTimePeriod.PrivilegeSuspensionCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivilegeSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PrivilegeSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrivilegeSuspensionPeriod";
			definition = "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PrivilegeSuspensionCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date on which withdrawal in street name requests
	 * on the outturn security will be accepted and the date on which the
	 * suspension will be released and withdrawal by transfer processing on the
	 * outturn security will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalSuspensionRelatedEvent
	 * DateTimePeriod.WithdrawalSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForWithdrawal = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawal";
			definition = "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.WithdrawalSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date for which book entry transfers will be
	 * accepted and the date on which the suspension will be released and book
	 * entry transfer processing will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BookEntryTransferSuspensionRelatedEvent
	 * DateTimePeriod.BookEntryTransferSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForBookEntryTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForBookEntryTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForBookEntryTransfer";
			definition = "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BookEntryTransferSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date for which deposits, into nominee name, at
	 * the agent will be accepted and the date on which the suspension will be
	 * released and deposits at agent will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#DepositAtAgentSuspensionRelatedEvent
	 * DateTimePeriod.DepositAtAgentSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDepositAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForDepositAtAgent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForDepositAtAgent";
			definition = "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.DepositAtAgentSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date for which deposits will be accepted and the
	 * date on which the suspension will be released and deposits will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#DepositSuspensionRelatedEvent
	 * DateTimePeriod.DepositSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForDeposit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForDeposit";
			definition = "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.DepositSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date for which pledges will be accepted and the
	 * date on which the suspension will be released and pledge processing will
	 * resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#PledgeSuspensionRelatedEvent
	 * DateTimePeriod.PledgeSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForPledge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForPledge = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForPledge";
			definition = "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PledgeSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date for which intra-position balances can be
	 * segregated and the date on which the suspension will be released and the
	 * ability to segregate intra-position balances will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SegregationPeriodRelatedEvent
	 * DateTimePeriod.SegregationPeriodRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForSegregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForSegregation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForSegregation";
			definition = "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.SegregationPeriodRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date for which withdrawals, from nominee name at
	 * the agent will be accepted and the date on which the suspension will be
	 * released and withdrawals at agent processing will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalAtAgentSuspensionRelatedEvent
	 * DateTimePeriod.WithdrawalAtAgentSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForWithdrawalAtAgent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalAtAgent";
			definition = "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.WithdrawalAtAgentSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date for which physical withdrawals in the
	 * nominee's name will be accepted and the date on which the suspension will
	 * be released and physical withdrawals in the nominee's name will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalInNomineeNameSuspensionRelatedEvent
	 * DateTimePeriod.WithdrawalInNomineeNameSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInNomineeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForWithdrawalInNomineeName = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInNomineeName";
			definition = "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.WithdrawalInNomineeNameSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period defining the last date on which withdrawal requests in street
	 * name's will be accepted on the event security and the date on which the
	 * suspension will be released and withdrawal in street name's processing on
	 * the event security will resume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#WithdrawalInStreetNameSuspensionRelatedEvent
	 * DateTimePeriod.WithdrawalInStreetNameSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInStreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DepositorySuspensionPeriodForWithdrawalInStreetName = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInStreetName";
			definition = "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.WithdrawalInStreetNameSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the settlement activities at the co-depositories are
	 * suspended in order to stabilise the holdings at the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#CoDepositoriesSuspensionRelatedEvent
	 * DateTimePeriod.CoDepositoriesSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoDepositoriesSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CoDepositoriesSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoDepositoriesSuspensionPeriod";
			definition = "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CoDepositoriesSuspensionRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate action event for which a depository suspension period is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#SuspensionPeriod
	 * CorporateActionEvent.SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a depository suspension period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SuspensionPeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action event for which a depository suspension period is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SuspensionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SuspensionPeriod";
				definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.PrivilegeSuspensionCorporateAction, com.tools20022.repository.entity.DateTimePeriod.WithdrawalSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.BookEntryTransferSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.DepositAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.DepositSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.PledgeSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.SegregationPeriodRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.WithdrawalAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.WithdrawalInNomineeNameSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.WithdrawalInStreetNameSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.CoDepositoriesSuspensionRelatedEvent, com.tools20022.repository.entity.CorporateActionEvent.SuspensionPeriod);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SuspensionPeriod.PrivilegeSuspensionPeriod, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawal,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForBookEntryTransfer, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDepositAtAgent,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDeposit, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForPledge,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForSegregation, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalAtAgent,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInNomineeName, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInStreetName,
						com.tools20022.repository.entity.SuspensionPeriod.CoDepositoriesSuspensionPeriod, com.tools20022.repository.entity.SuspensionPeriod.CorporateActionEvent);
			}
		});
		return mmObject_lazy.get();
	}
}