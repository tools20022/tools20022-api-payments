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
import com.tools20022.repository.codeset.ActionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of action to be performed by the POI system (Point Of Interaction).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#DisplayMessage
 * ActionTypeCode.mmDisplayMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#PrintMessage
 * ActionTypeCode.mmPrintMessage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#Referral
 * ActionTypeCode.mmReferral}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#CaptureCard
 * ActionTypeCode.mmCaptureCard}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#PINRetry
 * ActionTypeCode.mmPINRetry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#PINLastTry
 * ActionTypeCode.mmPINLastTry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#RequestData
 * ActionTypeCode.mmRequestData}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#Busy
 * ActionTypeCode.mmBusy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#IdentificationRequired
 * ActionTypeCode.mmIdentificationRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#ForbidOverride
 * ActionTypeCode.mmForbidOverride}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#AcceptCurrencyConversion
 * ActionTypeCode.mmAcceptCurrencyConversion}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#Decline
 * ActionTypeCode.mmDecline}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#UpdateTrack
 * ActionTypeCode.mmUpdateTrack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#AcceptHigherAmount
 * ActionTypeCode.mmAcceptHigherAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#AcceptLowerAmount
 * ActionTypeCode.mmAcceptLowerAmount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#AcceptFees
 * ActionTypeCode.mmAcceptFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#DistributeCoupon
 * ActionTypeCode.mmDistributeCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#PerformRequest
 * ActionTypeCode.mmPerformRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode#NoReasonForDecline
 * ActionTypeCode.mmNoReasonForDecline}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#BlockCard
 * ActionTypeCode.mmBlockCard}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#Approve
 * ActionTypeCode.mmApprove}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ActionTypeCode#FallForward
 * ActionTypeCode.mmFallForward}</li>
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
 * <li>"DISP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of action to be performed by the POI system (Point Of Interaction)."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ActionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Message to display, print or log.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message to display, print or log."</li>
	 * </ul>
	 */
	public static final ActionTypeCode DisplayMessage = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisplayMessage";
			definition = "Message to display, print or log.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * Print a message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrintMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Print a message."</li>
	 * </ul>
	 */
	public static final ActionTypeCode PrintMessage = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrintMessage";
			definition = "Print a message.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "PRNT";
		}
	};
	/**
	 * Referral has to be performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RFRL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Referral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Referral has to be performed."</li>
	 * </ul>
	 */
	public static final ActionTypeCode Referral = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Referral";
			definition = "Referral has to be performed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "RFRL";
		}
	};
	/**
	 * Capture the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaptureCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Capture the card."</li>
	 * </ul>
	 */
	public static final ActionTypeCode CaptureCard = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CaptureCard";
			definition = "Capture the card.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "CPTR";
		}
	};
	/**
	 * PIN (Personal Identification Number) is wrong, retry a PIN verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRetry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN (Personal Identification Number) is wrong, retry a PIN verification."
	 * </li>
	 * </ul>
	 */
	public static final ActionTypeCode PINRetry = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINRetry";
			definition = "PIN (Personal Identification Number) is wrong, retry a PIN verification.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "PINR";
		}
	};
	/**
	 * Last PIN (Personal Identification Number) try.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINLastTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last PIN (Personal Identification Number) try."</li>
	 * </ul>
	 */
	public static final ActionTypeCode PINLastTry = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINLastTry";
			definition = "Last PIN (Personal Identification Number) try.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "PINL";
		}
	};
	/**
	 * Request additional data through a displayed text and request confirmation
	 * by an attendant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RQDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request additional data through a displayed text and request confirmation by an attendant."
	 * </li>
	 * </ul>
	 */
	public static final ActionTypeCode RequestData = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestData";
			definition = "Request additional data through a displayed text and request confirmation by an attendant.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "RQDT";
		}
	};
	/**
	 * Server busy, try later.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUSY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Busy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Server busy, try later."</li>
	 * </ul>
	 */
	public static final ActionTypeCode Busy = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Busy";
			definition = "Server busy, try later.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "BUSY";
		}
	};
	/**
	 * Additional identification required (passport, ID card, etc.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RQID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional identification required (passport, ID card, etc.)."</li>
	 * </ul>
	 */
	public static final ActionTypeCode IdentificationRequired = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationRequired";
			definition = "Additional identification required (passport, ID card, etc.).";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "RQID";
		}
	};
	/**
	 * Payment application cannot propose to the merchant an override of the
	 * payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForbidOverride"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment application cannot propose to the merchant an override of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final ActionTypeCode ForbidOverride = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForbidOverride";
			definition = "Payment application cannot propose to the merchant an override of the payment transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "NOVR";
		}
	};
	/**
	 * Ask the cardholder to accept the currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptCurrencyConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ask the cardholder to accept the currency conversion."</li>
	 * </ul>
	 */
	public static final ActionTypeCode AcceptCurrencyConversion = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptCurrencyConversion";
			definition = "Ask the cardholder to accept the currency conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "DCCQ";
		}
	};
	/**
	 * Decline the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Decline the transaction."</li>
	 * </ul>
	 */
	public static final ActionTypeCode Decline = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decline";
			definition = "Decline the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "DCLN";
		}
	};
	/**
	 * Track provided in the response must be updated on the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateTrack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Track provided in the response must be updated on the card."</li>
	 * </ul>
	 */
	public static final ActionTypeCode UpdateTrack = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateTrack";
			definition = "Track provided in the response must be updated on the card.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "TRCK";
		}
	};
	/**
	 * MinimumAmount must be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HAMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptHigherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MinimumAmount must be accepted."</li>
	 * </ul>
	 */
	public static final ActionTypeCode AcceptHigherAmount = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptHigherAmount";
			definition = "MinimumAmount must be accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "HAMT";
		}
	};
	/**
	 * MaximumAuthorisedAmount must be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptLowerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MaximumAuthorisedAmount must be accepted."</li>
	 * </ul>
	 */
	public static final ActionTypeCode AcceptLowerAmount = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptLowerAmount";
			definition = "MaximumAuthorisedAmount must be accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "LAMT";
		}
	};
	/**
	 * Fees must be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees must be accepted."</li>
	 * </ul>
	 */
	public static final ActionTypeCode AcceptFees = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptFees";
			definition = "Fees must be accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "FEES";
		}
	};
	/**
	 * Distribute a coupon from the cassette of coupon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributeCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribute a coupon from the cassette of coupon."</li>
	 * </ul>
	 */
	public static final ActionTypeCode DistributeCoupon = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributeCoupon";
			definition = "Distribute a coupon from the cassette of coupon.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "CPNS";
		}
	};
	/**
	 * Request to be performed by the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RQST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerformRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to be performed by the ATM."</li>
	 * </ul>
	 */
	public static final ActionTypeCode PerformRequest = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerformRequest";
			definition = "Request to be performed by the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "RQST";
		}
	};
	/**
	 * No reason for declining the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoReasonForDecline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No reason for declining the transaction."</li>
	 * </ul>
	 */
	public static final ActionTypeCode NoReasonForDecline = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoReasonForDecline";
			definition = "No reason for declining the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "NDCL";
		}
	};
	/**
	 * Block the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Block the card."</li>
	 * </ul>
	 */
	public static final ActionTypeCode BlockCard = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockCard";
			definition = "Block the card.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "BLCK";
		}
	};
	/**
	 * Approve the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approve"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Approve the transaction."</li>
	 * </ul>
	 */
	public static final ActionTypeCode Approve = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approve";
			definition = "Approve the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "APPV";
		}
	};
	/**
	 * Fall-forward from contactless to chip card transaction required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActionTypeCode
	 * ActionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fall-forward from contactless to chip card transaction required."</li>
	 * </ul>
	 */
	public static final ActionTypeCode FallForward = new ActionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallForward";
			definition = "Fall-forward from contactless to chip card transaction required.";
			owner_lazy = () -> com.tools20022.repository.codeset.ActionTypeCode.mmObject();
			codeName = "FLFW";
		}
	};
	final static private LinkedHashMap<String, ActionTypeCode> codesByName = new LinkedHashMap<>();

	protected ActionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DISP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActionTypeCode";
				definition = "Type of action to be performed by the POI system (Point Of Interaction).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionTypeCode.DisplayMessage, com.tools20022.repository.codeset.ActionTypeCode.PrintMessage, com.tools20022.repository.codeset.ActionTypeCode.Referral,
						com.tools20022.repository.codeset.ActionTypeCode.CaptureCard, com.tools20022.repository.codeset.ActionTypeCode.PINRetry, com.tools20022.repository.codeset.ActionTypeCode.PINLastTry,
						com.tools20022.repository.codeset.ActionTypeCode.RequestData, com.tools20022.repository.codeset.ActionTypeCode.Busy, com.tools20022.repository.codeset.ActionTypeCode.IdentificationRequired,
						com.tools20022.repository.codeset.ActionTypeCode.ForbidOverride, com.tools20022.repository.codeset.ActionTypeCode.AcceptCurrencyConversion, com.tools20022.repository.codeset.ActionTypeCode.Decline,
						com.tools20022.repository.codeset.ActionTypeCode.UpdateTrack, com.tools20022.repository.codeset.ActionTypeCode.AcceptHigherAmount, com.tools20022.repository.codeset.ActionTypeCode.AcceptLowerAmount,
						com.tools20022.repository.codeset.ActionTypeCode.AcceptFees, com.tools20022.repository.codeset.ActionTypeCode.DistributeCoupon, com.tools20022.repository.codeset.ActionTypeCode.PerformRequest,
						com.tools20022.repository.codeset.ActionTypeCode.NoReasonForDecline, com.tools20022.repository.codeset.ActionTypeCode.BlockCard, com.tools20022.repository.codeset.ActionTypeCode.Approve,
						com.tools20022.repository.codeset.ActionTypeCode.FallForward);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DisplayMessage.getCodeName().get(), DisplayMessage);
		codesByName.put(PrintMessage.getCodeName().get(), PrintMessage);
		codesByName.put(Referral.getCodeName().get(), Referral);
		codesByName.put(CaptureCard.getCodeName().get(), CaptureCard);
		codesByName.put(PINRetry.getCodeName().get(), PINRetry);
		codesByName.put(PINLastTry.getCodeName().get(), PINLastTry);
		codesByName.put(RequestData.getCodeName().get(), RequestData);
		codesByName.put(Busy.getCodeName().get(), Busy);
		codesByName.put(IdentificationRequired.getCodeName().get(), IdentificationRequired);
		codesByName.put(ForbidOverride.getCodeName().get(), ForbidOverride);
		codesByName.put(AcceptCurrencyConversion.getCodeName().get(), AcceptCurrencyConversion);
		codesByName.put(Decline.getCodeName().get(), Decline);
		codesByName.put(UpdateTrack.getCodeName().get(), UpdateTrack);
		codesByName.put(AcceptHigherAmount.getCodeName().get(), AcceptHigherAmount);
		codesByName.put(AcceptLowerAmount.getCodeName().get(), AcceptLowerAmount);
		codesByName.put(AcceptFees.getCodeName().get(), AcceptFees);
		codesByName.put(DistributeCoupon.getCodeName().get(), DistributeCoupon);
		codesByName.put(PerformRequest.getCodeName().get(), PerformRequest);
		codesByName.put(NoReasonForDecline.getCodeName().get(), NoReasonForDecline);
		codesByName.put(BlockCard.getCodeName().get(), BlockCard);
		codesByName.put(Approve.getCodeName().get(), Approve);
		codesByName.put(FallForward.getCodeName().get(), FallForward);
	}

	public static ActionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ActionTypeCode[] values() {
		ActionTypeCode[] values = new ActionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ActionTypeCode> {
		@Override
		public ActionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ActionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}