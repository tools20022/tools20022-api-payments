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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of capital.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#Approved
 * CapitalTypeCode.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#IssuedVotingRights
 * CapitalTypeCode.IssuedVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#MaximumIncrease
 * CapitalTypeCode.MaximumIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#Outstanding
 * CapitalTypeCode.Outstanding}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#Redeemed
 * CapitalTypeCode.Redeemed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#StatedCapital
 * CapitalTypeCode.StatedCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#TreasuryStock
 * CapitalTypeCode.TreasuryStock}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#Unissued
 * CapitalTypeCode.Unissued}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#Withdrawn
 * CapitalTypeCode.Withdrawn}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#Authorised
 * CapitalTypeCode.Authorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#InCirculation
 * CapitalTypeCode.InCirculation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CapitalTypeCode#Issued
 * CapitalTypeCode.Issued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CapitalTypeCode#IssuedReserveCapital
 * CapitalTypeCode.IssuedReserveCapital}</li>
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
	public static final MMCode Approved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode IssuedVotingRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode MaximumIncrease = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Outstanding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Redeemed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode StatedCapital = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TreasuryStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Unissued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Withdrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Authorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode InCirculation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Issued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode IssuedReserveCapital = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedReserveCapital";
			definition = "Issued reserve capital.";
			owner_lazy = () -> CapitalTypeCode.mmObject();
			codeName = "IRCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("APPD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CapitalTypeCode";
				definition = "Specifies the type of capital.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CapitalTypeCode.Approved, com.tools20022.repository.codeset.CapitalTypeCode.IssuedVotingRights,
						com.tools20022.repository.codeset.CapitalTypeCode.MaximumIncrease, com.tools20022.repository.codeset.CapitalTypeCode.Outstanding, com.tools20022.repository.codeset.CapitalTypeCode.Redeemed,
						com.tools20022.repository.codeset.CapitalTypeCode.StatedCapital, com.tools20022.repository.codeset.CapitalTypeCode.TreasuryStock, com.tools20022.repository.codeset.CapitalTypeCode.Unissued,
						com.tools20022.repository.codeset.CapitalTypeCode.Withdrawn, com.tools20022.repository.codeset.CapitalTypeCode.Authorised, com.tools20022.repository.codeset.CapitalTypeCode.InCirculation,
						com.tools20022.repository.codeset.CapitalTypeCode.Issued, com.tools20022.repository.codeset.CapitalTypeCode.IssuedReserveCapital);
			}
		});
		return mmObject_lazy.get();
	}
}