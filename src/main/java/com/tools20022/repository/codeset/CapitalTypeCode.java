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
 * Specifies the type of capital.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmApproved
 * CapitalTypeCode.mmApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmIssuedVotingRights
 * CapitalTypeCode.mmIssuedVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmMaximumIncrease
 * CapitalTypeCode.mmMaximumIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmOutstanding
 * CapitalTypeCode.mmOutstanding}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmRedeemed
 * CapitalTypeCode.mmRedeemed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmStatedCapital
 * CapitalTypeCode.mmStatedCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmTreasuryStock
 * CapitalTypeCode.mmTreasuryStock}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmUnissued
 * CapitalTypeCode.mmUnissued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmWithdrawn
 * CapitalTypeCode.mmWithdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmAuthorised
 * CapitalTypeCode.mmAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmInCirculation
 * CapitalTypeCode.mmInCirculation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmIssued
 * CapitalTypeCode.mmIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#mmIssuedReserveCapital
 * CapitalTypeCode.mmIssuedReserveCapital}</li>
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
 * <li>"APPD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CapitalTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of capital."</li>
 * </ul>
 */
public class CapitalTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Approved capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Approved capital."</li>
	 * </ul>
	 */
	public static final MMCode mmApproved = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Approved";
			definition = "Approved capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "APPD";
		}
	};
	/**
	 * Issued voting rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuedVotingRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issued voting rights."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuedVotingRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuedVotingRights";
			definition = "Issued voting rights.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "ISVR";
		}
	};
	/**
	 * Maximum amount of increase.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MXIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumIncrease"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum amount of increase."</li>
	 * </ul>
	 */
	public static final MMCode mmMaximumIncrease = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumIncrease";
			definition = "Maximum amount of increase.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "MXIN";
		}
	};
	/**
	 * Outstanding capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OUTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Outstanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outstanding capital."</li>
	 * </ul>
	 */
	public static final MMCode mmOutstanding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Outstanding";
			definition = "Outstanding capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "OUTS";
		}
	};
	/**
	 * Redeemed capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redeemed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redeemed capital."</li>
	 * </ul>
	 */
	public static final MMCode mmRedeemed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Redeemed";
			definition = "Redeemed capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "REDE";
		}
	};
	/**
	 * Stated capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatedCapital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stated capital."</li>
	 * </ul>
	 */
	public static final MMCode mmStatedCapital = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatedCapital";
			definition = "Stated capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "STCA";
		}
	};
	/**
	 * Issued reserve capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRSO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issued reserve capital."</li>
	 * </ul>
	 */
	public static final MMCode mmTreasuryStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryStock";
			definition = "Issued reserve capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "TRSO";
		}
	};
	/**
	 * Contingent capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unissued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contingent capital."</li>
	 * </ul>
	 */
	public static final MMCode mmUnissued = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unissued";
			definition = "Contingent capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "UISS";
		}
	};
	/**
	 * Withdrawn capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawn capital."</li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawn = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "Withdrawn capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "WTHD";
		}
	};
	/**
	 * Authorised capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorised capital."</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Authorised";
			definition = "Authorised capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "AUTD";
		}
	};
	/**
	 * In circulation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InCirculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "In circulation."</li>
	 * </ul>
	 */
	public static final MMCode mmInCirculation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InCirculation";
			definition = "In circulation.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "ICIR";
		}
	};
	/**
	 * Issued capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISUD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issued capital."</li>
	 * </ul>
	 */
	public static final MMCode mmIssued = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issued";
			definition = "Issued capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "ISUD";
		}
	};
	/**
	 * Issued reserve capital.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode
	 * CapitalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuedReserveCapital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issued reserve capital."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuedReserveCapital = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuedReserveCapital";
			definition = "Issued reserve capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "IRCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("APPD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CapitalTypeCode";
				definition = "Specifies the type of capital.";
				code_lazy = () -> Arrays.asList(CapitalTypeCode.mmApproved, CapitalTypeCode.mmIssuedVotingRights, CapitalTypeCode.mmMaximumIncrease, CapitalTypeCode.mmOutstanding, CapitalTypeCode.mmRedeemed,
						CapitalTypeCode.mmStatedCapital, CapitalTypeCode.mmTreasuryStock, CapitalTypeCode.mmUnissued, CapitalTypeCode.mmWithdrawn, CapitalTypeCode.mmAuthorised, CapitalTypeCode.mmInCirculation, CapitalTypeCode.mmIssued,
						CapitalTypeCode.mmIssuedReserveCapital);
			}
		});
		return mmObject_lazy.get();
	}
}